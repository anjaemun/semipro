package com.semi.travel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.semi.travel.dto.MemberDto;
import com.semi.travel.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	@Autowired
	private MemberService memberService;
	
	
	@GetMapping("/")
	public String home() {
		log.info("home()");
		
		return "home";
	}
	
	//회원가입 save.jsp로 이동
	@GetMapping("/save")
	public String sava() {
		System.out.println("save.html 실행");
		return "save";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute MemberDto memberDto) {
		System.out.println("save ");
		MemberService.save(memberDto);
		return "index";
	}
	
}
