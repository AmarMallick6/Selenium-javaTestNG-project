package seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePop_upHandle {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//original url is: https://the-internet.herokuapp.com/basic_auth and username & password is admin
		//we can handle this types of pop-up injecting username &password directly in url 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 

	}

}
