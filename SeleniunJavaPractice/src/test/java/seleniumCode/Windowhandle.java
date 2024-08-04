package seleniumCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'orangehrm-login-footer-sm')]//a[2]")).click();
		
		//Get Window Handle>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		  String  parentwID    =driver.getWindowHandle();
		  String  pwidtitle  = driver.getTitle();
		 System.out.println("parentWID : "+parentwID + "    ||        "   + "ParentwindowTitle : "+ pwidtitle );
		
		
		//Get Window Handles Approach-01>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
		   Set<String> windowid = driver.getWindowHandles();
          ArrayList<String> windows = new ArrayList<String>(windowid);
          String parentwid = windows.get(0);
          String childwid1 = windows.get(1);
          String childwid2 = windows.get(2); 
         
		   String cw2Title = driver.switchTo().window(childwid2).getTitle();
		   String cw1Title = driver.switchTo().window(childwid1).getTitle();
		   String pwTitle = driver.switchTo().window(parentwid).getTitle();
		   System.out.println(cw1Title);   
		   System.out.println(cw2Title);   
		   System.out.println(pwTitle);   
		
	}

}
