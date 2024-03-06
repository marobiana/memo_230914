package com.memo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component // singleton
@Aspect // 부가 기능 정의(advice) + 어디에 적용(pointcut)  
public class TimeTraceAop {
	
	// 1) 수행할 패키지 지정
	//@Around("execution(* com.memo..*(..))")
	
	// 2) 어노테이션 지정
	@Around("@annotation(TimeTrace)") // 어느 어노테이션이 붙어있을 때 수행되는가?
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		// 타겟이 적용하는 메소드 - joinPoint
		
		// 시간 측정
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		// 본래 할 일 수행 (예: 회원가입, 로그인, 글쓰기 등)
		Object proceedObj = joinPoint.proceed();
		
		stopWatch.stop();
		log.info("####### 실행 시간(ms): {}", stopWatch.getTotalTimeMillis());
		log.info("$$$$$$$ 실행 시간:" + stopWatch.prettyPrint());
		
		return proceedObj;
	}
}




