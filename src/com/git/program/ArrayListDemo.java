package com.git.program;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Amol");
		list.add("Satywan");
		
		list.stream().forEach(x->System.out.println(x));
		
	}
}
