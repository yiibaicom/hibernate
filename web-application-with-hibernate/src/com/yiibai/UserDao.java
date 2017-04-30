package com.yiibai;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;


public class UserDao {

	public static int save(User u) {
		int i = 0;
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		// 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
		SessionFactory sessionFactory = new MetadataSources(registry)
				.buildMetadata().buildSessionFactory();

		
		Session session = sessionFactory.openSession();// 从会话工厂获取一个session
		Transaction t = session.beginTransaction();
		i = (Integer) session.save(u);
		t.commit();
		session.close();
		
		System.out.println(u.getName());
		return i;
	}
}
