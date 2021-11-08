package com.qa.community;

public class StringManipulation {
	public static void main(String[] args) {
		String myStr = "yesterday it was raining";
		String myStr2 = "today it is sunny";
//		System.out.println(myStr.replace("yesterday it was raining", "today it is sunny")); // Changes Element
		
		 System.out.println(myStr2.toUpperCase()+", "+myStr.toUpperCase());
		 myStr = myStr.substring (9,24);
		 myStr2 = myStr2.substring(0,6);
		 System.out.println(myStr2+myStr); 
	}
}
