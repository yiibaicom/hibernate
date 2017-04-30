package com.yiibai;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.stat.Statistics;

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
		Transaction tx = session.beginTransaction();
		
		Statistics stats = sessionFactory.getStatistics();
		System.out.println("Stats enabled="+stats.isStatisticsEnabled());
		
		stats.setStatisticsEnabled(true);
		System.out.println("Stats enabled="+stats.isStatisticsEnabled());

		session.save(new Employee("苏小牛", 12000));
		session.save(new Employee("库日天", 19000));
		
		Session session1 = sessionFactory.openSession();
		Employee emp1 = (Employee) session1.load(Employee.class, 1);
		System.out.println(emp1.getId() + " " + emp1.getName() + " "
				+ emp1.getSalary());
		session1.close();
		
		//再次查询ID=1的员工信息，因为使用了缓存，这里不会再发出查询语句...
		Session session11 = sessionFactory.openSession();
		Employee emp11 = (Employee) session11.load(Employee.class, 1);
		System.out.println(emp11.getId() + " " + emp11.getName() + " "
				+ emp11.getSalary());
		session11.close();
		
		
		Session session2 = sessionFactory.openSession();
		Employee emp2 = (Employee) session2.load(Employee.class, 2);
		System.out.println(emp2.getId() + " " + emp2.getName() + " "
				+ emp2.getSalary());
		session2.close();
		
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
