package com.ohgiraffers.member.model.service;

import com.common.SearchCondition;
import com.ohgiraffers.member.model.dao.MemberDAO;
import com.ohgiraffers.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;


public class MemberService {

    private MemberDAO memberDAO;
    public List<MemberDTO> selectMemberCheck(SearchCondition searchCondition) {

        // 이름으로 조회하는 서비스
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        List<MemberDTO> memberList = memberDAO.selectMemberCheck(searchCondition);

        sqlSession.close();

        return memberList;

    }

    public boolean selectNewMember(MemberDTO member) {

        // 고객 등록
        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.inserMember(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }



//    public boolean modifyMember(MemberDTO member) {
//        // 고객 정보 수정하는 문구
//
//        SqlSession sqlSession =getSqlSession();
//        memberDAO = sqlSession.getMapper(MemberDAO.class);
//
//        int result = memberDAO.updateMember(member);
//
//        if(result > 0) {
//            sqlSession.commit();
//        } else {
//            sqlSession.rollback();
//        }
//
//        sqlSession.close();
//        return result > 0;
//
//    }

    public boolean deleteMember(Map<String, String> parameter) {

        // 고객 삭제

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.deleteMember(parameter);

        if(result > 0 ) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;

    }
}
