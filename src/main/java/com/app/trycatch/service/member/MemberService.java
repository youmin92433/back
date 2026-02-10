package com.app.trycatch.service.member;

import com.app.trycatch.common.enumeration.member.Provider;
import com.app.trycatch.domain.member.MemberVO;
import com.app.trycatch.dto.member.IndividualMemberDTO;
import com.app.trycatch.dto.member.MemberDTO;
import com.app.trycatch.repository.member.AddressDAO;
import com.app.trycatch.repository.member.CorpMemberDAO;
import com.app.trycatch.repository.member.IndividualMemberDAO;
import com.app.trycatch.repository.member.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MemberService {
    private final MemberDAO memberDAO;
    private final IndividualMemberDAO individualMemberDAO;
    private final CorpMemberDAO corpMemberDAO;
    private final AddressDAO addressDAO;

//    public boolean chekcEmail(String memberEmail){
//        return memberDAO.findByMemberEmail(memberEmail).isEmpty();
//    }

    //   개인 회원가입
    public void joinIndividual(IndividualMemberDTO individualMemberDTO){

    }
}
