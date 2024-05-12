package com.psja;

import java.lang.Class;
import java.lang.reflect.Method;

public class CustomAnnotationCheck {

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
