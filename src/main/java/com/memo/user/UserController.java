package com.memo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.memo.aop.TimeTrace;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/user")
@Controller
public class UserController {

	/**
	 * 회원가입 화면
	 * @param model
	 * @return
	 */
	@GetMapping("/sign-up-view")
	public String signUpView() {
		return "user/signUp";
	}
	
	/**
	 * 로그인 화면
	 * @param model
	 * @return
	 */
	@TimeTrace
	@GetMapping("/sign-in-view")
	public String signInView() {
		return "user/signIn";
	}
	
	@RequestMapping("/sign-out")
	public String signOut(HttpSession session) {
		// 세션에 있는 내용을 모두 비운다.
		session.removeAttribute("userId");
		session.removeAttribute("userLoginId");
		session.removeAttribute("userName");
		
		// redirect 로그인 화면으로 이동
		return "redirect:/user/sign-in-view";
	}
}




