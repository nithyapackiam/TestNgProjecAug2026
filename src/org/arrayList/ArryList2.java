package org.arrayList;

import java.util.ArrayList;

public class ArryList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("kohli");
		a.add("dhoni");
		a.add(0,"rohit");
		a.add("Shreyas");
		
		for(int i=0;i<a.size();i++) {
			System.out.println("index is" + i + "name is" + a.get(i));
			
		}
	}

}
