package com.loadingeli.user_service.service;

import com.loadingeli.user_service.model.Member;
import com.loadingeli.user_service.model.MemberDTO;
import com.loadingeli.user_service.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member /*Optional<MemberDTO>*/ getMemberById(Long id) {
        return memberRepository.getReferenceById(id);

    }

    public void /*List<MemberDTO>*/ getAllMembers() {
        memberRepository.findAll();
    }

    public void /*MemberDTO*/ updateMemberById(Long id){
        Member memberToUpdate = memberRepository.getReferenceById(id);
    }

    public void deleteMemberById(Long id) {
        memberRepository.deleteById(id);
    }

    public Member createMember(Member newMember) {
        return memberRepository.save(newMember);
    }
}
