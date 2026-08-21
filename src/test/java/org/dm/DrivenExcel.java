package org.dm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DrivenExcel {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File(System.getProperty("user.dir")+"//ExcelFile//Data.xlsx");  
		
		FileInputStream fin= new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("sheet1");
		Row ro = sheet.getRow(2);
		Cell cell = ro.getCell(1);
		System.out.println("cell of the data:"+cell);
		
		
		
	}
	
	
	

}
