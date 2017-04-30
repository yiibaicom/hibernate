package com.yiibai;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class Logging {

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution throws exception.
	 */
	@AfterThrowing(pointcut = "execution(* com.yiibai.Student.*(..))", throwing = "error")
	public void afterThrowingAdvice(JoinPoint jp, Throwable error) {
		System.out.println("[afterThrowingAdvice] Method Signature: "
				+ jp.getSignature());
		System.out.println("[afterThrowingAdvice] Exception: " + error);
	}
}