package org.pyramid;

public class PyramidForwaard {
	
	public static void main(String[] args) {
		int k= 1;
		
		for(int i=4;i>0;i--) {
			
			
			for(int j=4;j>i-1;j--) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			
				
			}
			System.out.println("");
		}
		
	}

}
