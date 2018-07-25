package xcelreading;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelexample {
public static void main(String[] args) throws Exception {
	//@SuppressWarnings("resource")
	XSSFWorkbook wb =new XSSFWorkbook("seleniumsample.xlsx");
	
	XSSFSheet sh= wb.getSheet("test data");
	int rowcount=sh.getPhysicalNumberOfRows();
	
	for (int i = 0; i < rowcount; i++) {
		int colcount = sh.getRow(i).getPhysicalNumberOfCells();
		for (int j = 0; j < colcount; j++) {
			XSSFCell cell=sh.getRow(i).getCell(j);
			System.out.println(cell);
		}
	}
}}
			
			
			
			
			
