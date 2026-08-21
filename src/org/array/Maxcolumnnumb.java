package org.array;

public class Maxcolumnnumb {
	
	public static void main(String[] args) {
		int abc[][]= {{5,4,3},{7,4,1},{9,2,5}};
		int k=0;
		int max=0;
		int min= abc[0][0];
		int mincolumn =0;
		for(int i=0;i<abc.length;i++) {
			
			for(int j=0;j<abc.length;j++) {
				
				if(abc[i][j]<min)
				min = abc[i][j];
				mincolumn=j;
				
			}
		}
		while(k<abc.length){
		if(abc[k][mincolumn]>max){
			max=abc[k][mincolumn];
			
		}
		k++;

		}
		System.out.println(max);
		
	}



}
