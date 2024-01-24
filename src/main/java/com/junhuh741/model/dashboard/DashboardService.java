package com.junhuh741.model.dashboard;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junhuh741.domain.entity.Member;
import com.junhuh741.repository.MemberRepository;

@Service
public class DashboardService {

	@Autowired
	MemberRepository memberRepository;
	
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

	public Optional<Member> getMemberById(Long id) {
		return memberRepository.findById(id);
	}
	
}
