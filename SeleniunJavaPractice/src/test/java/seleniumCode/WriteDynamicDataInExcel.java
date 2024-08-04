package seleniumCode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.*;


public class WriteDynamicDataInExcel {

	

	public static void main(String[] args) throws IOException {
	FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/Data Folder/WritingDynamicData.xlsx");
	XSSFWorkbook Wb =new XSSFWorkbook();
	Scanner sc= new Scanner(System.in);
	System.out.println("Total Rows Number :");
	 int noofrows =sc.nextInt();	                 
	System.out.println("Total Cells Number :");
	 int noofcells = sc.nextInt() ;  
	 XSSFSheet sheet = Wb.createSheet("Test Data");
	for (int r= 0; r< noofrows ; r++) {
		         XSSFRow currentRow = sheet.createRow(r);
		       for (int c= 0; c< noofcells ; c++) {
		    	              XSSFCell currentcell = currentRow.createCell(c);
		    	              currentcell.setCellValue(sc.next());
		       }
		
	}
	                Wb.write(fos);
	                Wb.close();
	                fos.close();
	}

}                
			


