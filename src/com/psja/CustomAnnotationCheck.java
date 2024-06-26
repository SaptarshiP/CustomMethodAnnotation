package com.psja;

import java.lang.Class;
import java.lang.reflect.Method;

public class CustomAnnotationCheck {
	
	/*
	 * We have got the access the custom class using reflection api and searching for the method with
	 * name and then checking that method is annoted with particular annotation then only
	 * we will invoke the method other wise will exceute the else clause
	 * */
	
	public static void main( String args[] ) {
		try {
			Class clazz =  CustomAnnotationCheck.class;
			Method m = clazz.getMethod("check", null);
			if( m.isAnnotationPresent(TestInterface.class)) {
				m.invoke(new CustomAnnotationCheck(), null);
			}else {
				System.out.println("The method is not annoted");
			}

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
	}
	
	@TestInterface
	public void check() {
		System.out.println("The method executed");
		
	}
	
}
