package com.memo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.util.ObjectUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@SpringBootTest
class MemoApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	
	//@Test
	void 더하기테스트() {
		log.info("$$$$$$$ 더하기 테스트 시작");
		int a = 10;
		int b = 20;
		
		assertEquals(20, a + b);
	}
	
	@Test
	void 비어있는지확인() {
		//List<Integer> list = new ArrayList<>(); // []
		List<Integer> list = null; 
		if (ObjectUtils.isEmpty(list)) {
			log.info("list is empty.");
		}
		
//		String str = null;
		String str = "";
		if (ObjectUtils.isEmpty(str)) {
			log.info("str is empty.");
		}
	}

}











