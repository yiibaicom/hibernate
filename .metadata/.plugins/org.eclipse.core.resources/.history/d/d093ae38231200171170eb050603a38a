package com.javatpoint;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class StoreData {
public static void main(String[] args) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("java is a programming language");
	list1.add("java is a platform");
	
	ArrayList<String> list2=new ArrayList<String>();
	list2.add("Servlet is an Interface");
	list2.add("Servlet is an API");
	
	Question question1=new Question();
	question1.setQname("What is Java?");
	question1.setAnswers(list1);
	
	Question question2=new Question();
	question2.setQname("What is Servlet?");
	question2.setAnswers(list2);
	
	session.persist(question1);
	session.persist(question2);
	
	t.commit();
	session.close();
	System.out.println("success");
	
}
}
