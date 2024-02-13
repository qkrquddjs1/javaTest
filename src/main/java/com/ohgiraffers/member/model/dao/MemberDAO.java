package com.ohgiraffers.member.model.dao;

import com.common.SearchCondition;
import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.List;
import java.util.Map;

public interface MemberDAO {
    List<MemberDTO> selectMemberCheck(SearchCondition searchCondition);

    int inserMember(MemberDTO member);

    int deleteMember(Map<String, String> parameter);

//    int updateMember(MemberDTO member);
}
