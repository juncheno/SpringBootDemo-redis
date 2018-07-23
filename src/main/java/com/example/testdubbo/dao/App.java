package com.example.testdubbo.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.testdubbo.entity.User;

public class App {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
         userDao userDAO = (userDao)ac.getBean("userDao");
         User user = new User();
         user.setId(1);
         user.setName("liuxg");
         userDAO.saveUser(user);

         User liuxg = userDAO.getUser(1);
         System.out.println(liuxg.getName());
    }
}
