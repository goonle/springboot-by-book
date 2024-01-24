package com.junhuh741;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junhuh741.Entities.Member;
import com.junhuh741.Entities.MemberRepository;

@Service
public class TestService {
	@Autowired
	MemberRepository memberRepository;
	
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

	public Optional<Member> getMemberById(Long id) {
		return memberRepository.findById(id);
	}
	
}

