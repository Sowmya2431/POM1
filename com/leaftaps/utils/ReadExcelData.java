package com.leaftaps.utils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData {
	public static String[][] readData(String excelfileName) throws IOException {
		
		
		//step1:setup the path of the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelfileName+".xlsx");
		
		//step2: get the worksheet
		
		XSSFSheet ws = wb.getSheet("sheet1");
		
		int rowCount = ws.getLastRowNum();
		short cellCount = ws.getRow(0).getLastCellNum();
		
		//declare the 2D string array with rowcount and cellcount as size to read excel program
		String[][]data=new String[rowCount][cellCount];
		
		for (int i = 1; i <=rowCount;i++) {
			for (int j = 0; j <cellCount; j++) {
				//step3: get it in to the row
	           String text = ws.getRow(i).getCell(j).getStringCellValue();
		       System.out.println(text);
		       data[i-1][j]=text;
		
			}
		}
		//close the workbook
		
	    return data;
	}
	}
