package com.memo.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson01")
@Controller
public class Lesson01Controller {

	@GetMapping("/ex01")
	public String ex01() {
		return "lesson01/ex01";
	}
}
