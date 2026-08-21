package org.Map;

import java.util.ArrayList;

public class Exrcise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,4,4,5,2,1,6,6,5,2};
		
		ArrayList<Integer> A= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			int k=0;
			if(!A.contains(a[i])) {
				A.add(a[i]);
				k++;
				
				for(int j= i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						
						k++;
					}
					
				}
			}
			
			if(k==3) {
				System.out.println("unique number is" + a[i]);
			
		}
		

	}

}}
