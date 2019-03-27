package com.livetechstudy.spring.dependency.injection.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}
