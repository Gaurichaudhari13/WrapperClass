package com.jsp.wrapperclass;

public class WrapperClass {
	public static void main(String[] args) {
//		boxing
		int a = 20;
		Integer i = new Integer(a); // older version
		Integer i2 = Integer.valueOf(a);
		Integer b = a; // Auto-boxing
		
		

//		unboxing
		int d = b.intValue();
		int c = b; // Auto-unboxing

		System.out.println(d+" unboxing");
		System.out.println(c+" auto-unboxing");
		System.out.println(b+" auto-boxing");

	}

}
