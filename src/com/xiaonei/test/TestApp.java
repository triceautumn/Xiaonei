package com.xiaonei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
//		TestService ts=(TestService) ac.getBean("testServie");
//		System.out.println(ts.getName());
		String oldPhotoName="abcgdsfsdgs.jpg";
		String id="2";
		String newFilename=id+oldPhotoName.substring(oldPhotoName.indexOf("."), oldPhotoName.length());
		System.out.println(newFilename);
	}

}
