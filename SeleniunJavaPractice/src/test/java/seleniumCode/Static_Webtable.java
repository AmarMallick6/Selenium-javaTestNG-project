package seleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");	
		//All row count.......................................................................................................
	      List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		  int row =rows .size();
		//All column count.......................................................................................................
		  List<WebElement> columns= driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]//td"));
       int column=columns.size();
		System.out.println("Row size :"+row +"    "+"Column Size:"+column);
		//Print All rows and Columns data........................................................................
	
		for (int r=1;r<=row;r++) {
			List<WebElement> cols= driver.findElements(By.xpath("//table[@name='BookTable']//tr["+r+"]//td"));
			for (int c=0;c<cols.size();c++) {
				
				String result=cols.get(c).getText();
				System.out.print(result+"\t");
			}
			System.out.println(" ");
		}
		driver.close();
	
	}

}
