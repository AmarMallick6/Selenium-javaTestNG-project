package seleniumCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	   WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
	   //Select class use to handle Drop down List>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Select sc = new  Select(colors);
		sc.selectByIndex(1); //Using index Method
		Thread.sleep(3000);
		sc.selectByValue("white");  //using Value Method
		Thread.sleep(3000);
		sc.selectByVisibleText("Green"); //using VisibleText Method
//Count all options and print all...........................................................
		   List<WebElement> Allcoloroptions = sc.getOptions();
		   System.out.println("Total Colours :"+Allcoloroptions.size());
		   for (WebElement colour : Allcoloroptions) {
			   System.out.println(colour.getText());
			
		}
	}

}
