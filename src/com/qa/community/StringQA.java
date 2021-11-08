package com.qa.community;

public class StringQA {
	public static void main(String[] args) {
		String myStr = "String";
		String myStr2 = new String("String");
		String myStr3 = new String("String");
		System.out.println(myStr == myStr2);
		System.out.println(myStr.equals(myStr2));

		int stringLength = myStr.length(); // when string it counts char length
		System.out.println("String length is " + stringLength); // Tells you how many characters

		System.out.println(myStr.toUpperCase()); // Prints in all upper case
		System.out.println(myStr2.charAt(3)); // prints value given from element
		System.out.println(myStr3.indexOf("I")); // does it have letter
		System.out.println(myStr.contains("so")); // contains value
		System.out.println(myStr.substring(1, 4)); // Will print values but only up to 4 not including 4
		System.out.println(myStr.equalIgnoreCase(str)); //
		System.out.println(myStr.replace("String", "I like cheese")); // Changes Element
		
		for (int i =0; i<myStr.length(); i++) {
			System.out.println(myStr.charAt(i));
		}
		}
	}
}
}
