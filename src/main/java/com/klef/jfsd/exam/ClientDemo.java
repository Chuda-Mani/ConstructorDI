package com.klef.jfsd.exam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo 
{

	public static void main(String[] args) 
	{
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Employee s = context.getBean("sbean",Employee.class);
//		
//		System.out.println(s.getSname());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Constructor injection demonstration
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        // Setter injection with autowiring demonstration
        Course course = (Course) context.getBean("course");
        System.out.println(course);

	}

}
