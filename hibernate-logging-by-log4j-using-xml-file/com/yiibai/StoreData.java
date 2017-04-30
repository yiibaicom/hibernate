package com.yiibai;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class StoreData {
	public static void main(String[] args) {

		// Session session = new
		// AnnotationConfiguration().configure().buildSessionFactory().openSession();
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		// 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
		SessionFactory sessionFactory = new MetadataSources(registry)
				.buildMetadata().buildSessionFactory();

		/**** 上面是配置准备，下面开始我们的数据库操作 ******/
		Session session = sessionFactory.openSession();// 从会话工厂获取一个session
		Transaction t = session.beginTransaction();

		session.save(new Employee("Arun", 0));
		session.save(new Employee("Varun", 0));

		t.commit();
		session.close();
		System.out.println("record successfully persisted");

	}
}
