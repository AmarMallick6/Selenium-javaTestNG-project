package seleniumCode;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WriteCodeInExcel {

	public static void main(String[] args) throws IOException {
		//File>WorkBook>Sheet>Row>Cell..............
				FileOutputStream File = new FileOutputStream(System.getProperty("user.dir")+"/Data Folder/WritingInExcel.xlsx");
                XSSFWorkbook Workbook=new XSSFWorkbook();
                XSSFSheet  sheet = Workbook.createSheet("Data");
                
                       XSSFRow row1 = sheet.createRow(0);
                       row1.createCell(0).setCellValue("NAME");
                       row1.createCell(1).setCellValue("RESULT");
                       row1.createCell(2).setCellValue("MARKS");
                       
                       XSSFRow row2 = sheet.createRow(1);
                       row2.createCell(0).setCellValue("AMAR");
                       row2.createCell(1).setCellValue("PASS");
                       row2.createCell(2).setCellValue("75");
                       
                       XSSFRow row3 = sheet.createRow(2);
                       row3.createCell(0).setCellValue("AMIT");
                       row3.createCell(1).setCellValue("FAIL");
                       row3.createCell(2).setCellValue("25");
                       
                       Workbook.write(File);
                       Workbook.close();
                       File.close();
	}

}
