package com.yiibai;

public class Logging {

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void beforeAdvice() {
		System.out.println("[beforeAdvice]Going to setup student profile.");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	public void afterAdvice() {
		System.out.println("[After]Student profile setup complete.");
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	public void afterReturningAdvice(Object retVal) {
		System.out.println("[afterReturningAdvice] Returning: "
				+ retVal.toString());
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out
				.println("[afterThrowingAdvice] There has been an exception: "
						+ ex.toString());
	}
}