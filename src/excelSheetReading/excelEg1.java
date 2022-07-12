package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile= new File("D:\\selenium\\ExcelMyPractice.xlsx");
		
		//using WorkBookFactory class read excel sheet
		//how to read string value-----getStringCellValue()
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
         System.out.println(name);
         
         //how to read numeric value-------getNumericCellValue()
       double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
	    System.out.println(number);
	double number1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	   System.out.println(number1);
	   
	   //how to read char value----getStringCellValue
	  String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
	   System.out.println(mychar);
	   
	   //how to read bollean value----getBooleanCellValue();
	
	    boolean myvalue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
	  System.out.println(myvalue);
	  
	
	}
	

}
