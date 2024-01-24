package com.junhuh741.controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.junhuh741.domain.entity.Member;
import com.junhuh741.service.TestService;

@RestController
public class TestController {
	@Autowired
	TestService testService;
	
	@GetMapping("/test")
	public List<Member> getAllMembers(){
		List<Member> members = testService.getAllMembers();
		System.out.println(members);
		return members;
	}
	
	@GetMapping("/member")
	public Optional<Member> getMemberById2(@RequestParam(name="id") Long id){ 
		
		Optional<Member> members = testService.getMemberById(id);
		return members;
	}
	@GetMapping("/member/{id}")
	public Optional<Member> getMemberById(@PathVariable("id") Long id){ 
		
		Optional<Member> members = testService.getMemberById(id);
		return members;
	}
}
