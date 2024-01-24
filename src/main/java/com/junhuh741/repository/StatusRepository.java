package com.junhuh741.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junhuh741.domain.entity.Member;

@Repository
public interface StatusRepository  extends  JpaRepository<Member, Long> {

}
