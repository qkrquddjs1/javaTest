package com.ohgiraffers.resevation.model.service;

import com.ohgiraffers.car.model.dao.CarDAO;
import com.ohgiraffers.resevation.model.dao.ResevationDAO;
import com.ohgiraffers.resevation.model.dto.ReservationDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class ReservationService {
    private static ResevationDAO resevationDAO;
    public static List<ReservationDTO> selectAllResevationList() {

        // 예약 전체 조회
        SqlSession sqlSession = getSqlSession();
        resevationDAO = sqlSession.getMapper(ResevationDAO.class);

        List<ReservationDTO> allResevationList = resevationDAO.selectAllResevationList();

        sqlSession.close();

        return allResevationList;
    }

    public boolean deleteMember(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        resevationDAO = sqlSession.getMapper(ResevationDAO.class);

        int result = resevationDAO.deleteCar(parameter);

        if(result > 0 ) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }
}
