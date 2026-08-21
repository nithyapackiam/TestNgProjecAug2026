package org.arrayList;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main (String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("kohli");
		a.add("dhoni");
		a.add(0,"rohit");
		System.out.println(a);
		System.out.println(a.contains("kohli"));
		System.out.println(a.get(2));
		
	}

}
