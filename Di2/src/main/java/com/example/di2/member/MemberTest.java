package com.example.di2.member;

import com.example.di2.DependencyConfig;

public class MemberTest {
    public static void main(String[] args) {

        DependencyConfig dependencyConfig = new DependencyConfig();
        MemberService memberService = dependencyConfig.memberService();
        Member member = new Member(0L,"oo@gmail.cpcom","coco","010-1234-5678");
        memberService.createMember(member);

        Member currentMember = memberService.getMember(0L);

        System.out.println("회원 가입한 유저 : " + member.getName());
        System.out.println("현재 첫번째 유저  : " + currentMember.getName());

        if(member.getName().equals(currentMember.getName())){
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
        memberService.deleteMember(0L);

        if(memberService.getMember(0L) == null){
            System.out.println("회원 삭제가 정상적으로 완료되었습니다.");
        }
    }
}
