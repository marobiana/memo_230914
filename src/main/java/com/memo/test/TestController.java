package com.memo.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.memo.post.mapper.PostMapper;

@Controller
public class TestController {
	
	@Autowired
	private PostMapper postMapper;

	@GetMapping("/test1")
	@ResponseBody
	public String test1() {
		return "Hello world!";
	}
	
	@GetMapping("/test2")
	@ResponseBody
	public Map<String, Object> test2() {
		Map<String, Object> result = new HashMap<>();
		result.put("aaa", 111);
		result.put("bbb", 111);
		result.put("ccc", 222);
		return result; // json
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "test/test";
	}
	
	@GetMapping("/test4")
	@ResponseBody
	public List<Map<String, Object>> test4() {
		return postMapper.selectPostList();
	}
	
	@GetMapping("/test5")
	public String test5(){

		return "test/test";
	}
	
	@PostMapping("/test6")
	@ResponseBody
	public List<Map<String, Object>> create(
			@RequestBody List<Map<String, Object>> orderList){

		//List<Map<String, Object>> orderList = cartList;
		//List<ProductEntity> list = productList;

		//String number = phoneNumber;
		return orderList;
	}
}




