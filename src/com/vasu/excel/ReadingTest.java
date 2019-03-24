package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest 
{
	public static void main(String[] args) throws Exception
	{
		File srcFile=new File("C:\\Users\\demo\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Login");
		int rcnt=ws.getLastRowNum();
		for (int i = 0; i <=rcnt; i++)
		{
			String data1=ws.getRow(i).getCell(0).getStringCellValue();
			String data2=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data1+"---"+data2);
		}
		
	}

}
