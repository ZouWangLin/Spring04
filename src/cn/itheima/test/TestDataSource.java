package cn.itheima.test;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestDataSource {
	private ApplicationContext applicationContext=
			new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");

	/**
	 * 第一个案例：测试DataSource
	 */
	@Test
	void test() throws Exception {
		//1.从IOC容器中获取连接池对象
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		//2.获取连接
		Connection connection = dataSource.getConnection();
		//3.验证结果
		System.out.println(connection);
		
	}

}
