package me.sully.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;

// 엔티티 Member, 기본키 타입 Long
public interface MemberRepository extends JpaRepository<Member, Long> {
}
