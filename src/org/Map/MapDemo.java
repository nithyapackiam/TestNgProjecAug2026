package org.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(0, "kohli");
		h.put(1, "dhoni");
		h.put(1, "rohit");
		h.put(3, "Iyer");
		
		Set s = h.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry mp = (Map.Entry)i.next();
			System.out.println(mp.getValue());
			System.out.println(mp.getKey());
			
		}

	}

}
