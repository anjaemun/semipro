package com.semi.travel;

<<<<<<< HEAD
=======

import java.util.Locale;
>>>>>>> branch 'develop' of https://github.com/anjaemun/semipro.git

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

<<<<<<< HEAD
import com.semi.travel.dto.MemberDto;
import com.semi.travel.service.MemberService;

import lombok.extern.slf4j.Slf4j;
=======
>>>>>>> branch 'develop' of https://github.com/anjaemun/semipro.git

@Controller
@Slf4j
public class HomeController {
	@Autowired
	private MemberService memberService;
	
	
<<<<<<< HEAD
	@GetMapping("/")
	public String home() {
		log.info("home()");
		
=======
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
>>>>>>> branch 'develop' of https://github.com/anjaemun/semipro.git
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
