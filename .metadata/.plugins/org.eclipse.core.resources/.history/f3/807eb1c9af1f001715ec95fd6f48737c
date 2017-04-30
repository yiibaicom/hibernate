package com.yiibai;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.After;

@Aspect
public class Logging {

   /** Following is the definition for a pointcut to select
    *  all the methods available. So advice will be called
    *  for all the methods.
    */
   @Pointcut("execution(* com.yiibai.Student.getAge(..))")
   private void selectGetAge(){}

   /** 
    * This is the method which I would like to execute
    * after a selected method execution.
    */
   @After("selectGetAge()")
   public void afterAdvice(){
      System.out.println("[afterAdvice] Student profile setup completed.");
   }  
}