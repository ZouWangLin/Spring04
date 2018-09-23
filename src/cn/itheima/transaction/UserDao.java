package cn.itheima.transaction;

import org.springframework.transaction.annotation.Transactional;

public class UserDao {
	/*@Transaction注解 ，该注解可用加在方法上，也可以加在类上
		(1)propagation属性:用来设置事务的传播行为
		   事务的传播行为:一个方法运行在一个开启了事务的方法中时，当前方法是使用原有的事务
		   还是开启新的事务？这就叫事务的传播行为
		 propagation的默认值为:Propagation.REQUIRED(默认使用现有的事务)
		 propagation的值:Propagation.REQUIRED_NEW(不使用现有的事务，而开启自身的事务)
		 
		(2)isolation:用来设置事务的隔离级别
		   -REPEATABLE_READ:可重复读，MySql默认
		   -READ_COMMITTED:读已提交，Oracle默认
		   总结：一般使用READ_COMMITTED
		   
		(3)rollbackFor:遇到什么异常回滚，值是异常的类型
		   rollbackForClassName:遇到什么异常回滚，值是异常的名字
		   noRollbackFor:设置不回滚，值是异常的类型
		   noRollbackForClassName:设置不回滚，值是异常的名字
		   
		(4)readonly:设置只读属性，通常情况下如果是查询的操作，该属性
		设置readonly为true，如果不是可用设置readonly为false   
		
		(5)timeout:用来设置超时的时间，单位为秒
	*/
	@Transactional
	public void add() {
		
	}

}
