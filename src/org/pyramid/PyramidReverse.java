package org.pyramid;

public class PyramidReverse {
	
	public static void main(String[] args) {
		
		int k = 10;
		for(int i=4;i>0;i--) {
			for(int j=3;j>=i-1;j--) {
				
				System.out.print(k);
				System.out.print("\t");
				k--;
			}
			System.out.println("");
			
		}
		
	}

}
