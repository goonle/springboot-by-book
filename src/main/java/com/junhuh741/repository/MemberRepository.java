package com.junhuh741.repository;

import org.springframework.stereotype.Repository;

import com.junhuh741.domain.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
