package com.kh.spring.common.aop;
import org.aspectj.lang.ProceedingJoinPoint;


import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component	
@Aspect			
public class Stopwatch {

	
	@Pointcut("execution(* com.kh.spring.memo.controller..insertMemo(..))")	
	public void pointcut() {}

	@Around("pointcut()")   
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		StopWatch stopwatch = new StopWatch();   
		stopwatch.start();                      
		
		Object obj = joinPoint.proceed();         
		
		stopwatch.stop();                         
		log.info("소요시간: {}", stopwatch.getTotalTimeMillis() + "ms"); 
 

		return obj;
	}
}
