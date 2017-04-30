package com.yiibai;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {

	/**
	 * Following is the definition for a pointcut to select all the methods
	 * available. So advice will be called for all the methods.
	 */
	@Pointcut("execution(* com.yiibai.Student.getName(..))")
	private void selectGetName() {
	}

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	@Before("selectGetName()")
	public void beforeAdvice() {
		System.out.println("[beforeAdvice]Going to setup student profile.");
	}
}