package com.qa.community;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.print.DocFlavor.STRING;
import javax.xml.stream.events.Namespace;

public class JavaArrayList {

	public static void main(String[] args) {

		List<String> biscuits = new ArrayList<>();

		biscuits.add("Digestive");
		biscuits.add("jaffa cake");
		biscuits.add("Nice Biscuit");
		biscuits.add("Bourbon");
		biscuits.add("Rich Tea");

//System.out.println(names.get(0));

		biscuits.set(0, "Jammy dodger");

// System.out.println(biscuits.get(0));

		biscuits.remove(1);

		System.out.println(biscuits);
		Collections.sort(biscuits);
		System.out.println(biscuits);
		biscuits.add("Hobnob");
		System.out.println(biscuits.size());
		
	for (String types : biscuits) { //enhanced for loop
		System.out.println(types);
		
	for (int i=0; i<biscuits.size(); i++) {
		System.out.println(biscuits.get(i));
		
		Collections.swap(biscuits, 0, 4);
		System.out.println(biscuits);
		Collections.reverse(biscuits);
		System.out.println(biscuits);
	}
	}
	}
}