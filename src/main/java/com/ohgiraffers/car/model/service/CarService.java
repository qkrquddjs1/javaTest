package com.ohgiraffers.car.model.service;

import com.common.SearchCondition;
import com.ohgiraffers.car.model.dao.CarDAO;
import com.ohgiraffers.car.model.dto.CarDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class CarService {

    private static CarDAO carDAO;

    public static List<CarDTO> selectAppCarList() {
        // 전제조회
        SqlSession sqlSession = getSqlSession();
        carDAO = sqlSession.getMapper(CarDAO.class);

        List<CarDTO> allcarList = carDAO.selectAllcarList();

        sqlSession.close();

        return allcarList;


    }

    public List<CarDTO> selectCarByCondition(SearchCondition searchCondition) {
        // 조회조건 조회문

        SqlSession sqlSession = getSqlSession();
        carDAO = sqlSession.getMapper(CarDAO.class);

        List<CarDTO> carList = carDAO.selectCarByCondition(searchCondition);

        sqlSession.close();

        return carList;
    }

    public boolean newCar(CarDTO car) {
        // 자동차 등록 문구

        SqlSession sqlSession = getSqlSession();
        carDAO = sqlSession.getMapper(CarDAO.class);

        int result = carDAO.insertCar(car);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;

    }

    public boolean modifyCar(CarDTO car) {

        // 자동차 정보 수정하는 문구

        SqlSession sqlSession = getSqlSession();
        carDAO = sqlSession.getMapper(CarDAO.class);

        int result = carDAO.updateCar(car);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }

    public boolean deleteCar(Map<String, String> parameter) {

         // 차량 삭제

        SqlSession sqlSession = getSqlSession();
        carDAO = sqlSession.getMapper(CarDAO.class);

        int result = carDAO.deleteCar(parameter);

        if(result > 0 ) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;







    }
}
    
