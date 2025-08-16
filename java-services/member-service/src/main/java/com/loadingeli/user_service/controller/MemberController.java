package com.loadingeli.user_service.controller;

import com.loadingeli.user_service.model.Member;
import com.loadingeli.user_service.model.MemberDTO;
import com.loadingeli.user_service.repository.MemberRepository;
import com.loadingeli.user_service.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/{id}")
    public Member /*MemberDTO*/ getMemberbyId(@PathVariable("id") Long id) {
        return memberService.getMemberById(id);
    }

    @GetMapping("/all")
    public void /*List<MemberDTO>*/ getAllMembers() {
        memberService.getAllMembers();
    }

    @PostMapping("/create")
    public Member /*List<MemberDTO>*/ createMember(@RequestBody Member newMember) {
        return memberService.createMember(newMember);
    }

    @PutMapping("/update/{id}")
    public void /*MemberDTO*/ updateMemberById(@PathVariable("id") Long id) {
        memberService.updateMemberById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void /*List<MemberDTO>*/ deleteMemberById(@PathVariable("id") Long id) {
        memberService.deleteMemberById(id);
    }

}
