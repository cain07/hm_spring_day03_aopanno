package com.cain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cain.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestApp {

	@Autowired
	private AccountService service;
	@Test
	public void test01(){
//		String xmlpath ="applicationContext.xml";
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);
//		AccountService service = (AccountService) applicationContext.getBean("accountService");
		service.transfer("jack", "rose", 1000);
	}
	
}
