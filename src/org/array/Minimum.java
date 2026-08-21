package org.array;

public class Minimum {
	
	public static void main (String[] args) {
		
		int abc[][]= {{9,5,2},{5,7,4},{4,1,7}};
		
		int min=abc[0][0];
		
		for(int i=0;i<abc.length;i++) {
			
			for(int j=0;j<abc.length;j++) {
				
				if(abc[i][j]<min){
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);
		
	}

}
