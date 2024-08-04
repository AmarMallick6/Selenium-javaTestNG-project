package seleniumCode;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		//File>WorkBook>Sheet>Row>Cell..............
		FileInputStream File = new FileInputStream(System.getProperty("user.dir")+"/Data Folder/DataDemo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(File);
		 XSSFSheet Sheet = wb.getSheet("Sheet1");
		   int Allrows = Sheet.getLastRowNum();
		   int Allcells =Sheet.getRow(1).getLastCellNum();
		   System.out.println("Total Rows are :"+Allrows +" and  Total Columns are : " +Allcells);
	   
	    for (int r = 0; r<Allrows ; r++)
		   {
			    XSSFRow currentrow = Sheet.getRow(r);
			   for (int c = 0; c<Allcells ; c++)
			   {
					
				  XSSFCell cell = currentrow .getCell(c);
				  String data = cell .toString();
				     System.out.print( data+" ||");
				} 
			   System.out.println();
		   }	
		
		   wb.close();
		   File.close(); 
	}

}
