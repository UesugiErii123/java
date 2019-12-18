package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input_shili {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("d:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for(File file2:wenjian_jihe) {
			System.out.println(file2);
		}
				
	}
		public static void dwj(String wjm) throws IOException  {
			FileInputStream fin=new FileInputStream("shili.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(fin);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			int rows=sheet.getLastRowNum();
			System.out.println(rows);
			for (int i = 1; i < rows; i++) {
				@SuppressWarnings("unused")
				XSSFRow row=sheet.getRow(i);
				
			}
		}
}
