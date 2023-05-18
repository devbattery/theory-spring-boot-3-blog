package me.sully.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void test() {
        // CREATE
        memberRepository.save(new Member(1L, "A"));

        // READ
        Optional<Member> member = memberRepository.findById(1L);
        List<Member> allMembers = memberRepository.findAll();


        // DELETE
        memberRepository.deleteById(1L);
    }
}
