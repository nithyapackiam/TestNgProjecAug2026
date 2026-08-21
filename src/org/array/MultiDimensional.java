package org.array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiDimensional {
	
	public static void main(String[] args) {
		
		
int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("");
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
				
			}
		}
		
	}

}
