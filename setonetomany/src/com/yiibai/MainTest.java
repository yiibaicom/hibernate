package com.yiibai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class MainTest {
	public static void main(String[] args) {
		// 在5.1.0版本汇总，hibernate则采用如下新方式获取：
		// 1. 配置类型安全的准服务注册类，这是当前应用的单例对象，不作修改，所以声明为final
		// 在configure("cfg/hibernate.cfg.xml")方法中，如果不指定资源路径，默认在类路径下寻找名为hibernate.cfg.xml的文件
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		// 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
		SessionFactory sessionFactory = new MetadataSources(registry)
				.buildMetadata().buildSessionFactory();

		/**** 上面是配置准备，下面开始我们的数据库操作 ******/
		Session session = sessionFactory.openSession();// 从会话工厂获取一个session

		// creating transaction object
		Transaction t = session.beginTransaction();

		Question question1 = new Question();
		question1.setQname("What is Java?");
		session.save(question1);
		
		Answer ans1 = new Answer();
		ans1.setAnswername("java is a programming language");
		ans1.setPostedBy("Ravi Su");
		ans1.setQuestion(question1);
		//question1.getAnswers().add(ans1);
		
		session.save(ans1);
		
		Answer ans2 = new Answer();
		ans2.setAnswername("java is a platform");
		ans2.setPostedBy("Sudhir Lee");
		ans2.setQuestion(question1);
		session.save(ans2);
		
		t.commit();
		session.close();
		
		System.out.println("success");

	}
}
