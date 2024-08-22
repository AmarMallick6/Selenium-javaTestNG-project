package seleniumCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMoveUsingMouseActionClass {

	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		 Actions act = new Actions(driver);
		
   //  1)Single Value Slider (Basic Slider)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 /*  Both Slider and  Thumb/Handle are same elements
		  * Description: This is the most basic type of slider, where the user can select a single value within a defined range.
             Use Case: Commonly used for volume control, brightness settings, or selecting a percentage.
		 */
	   
		  driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		 WebElement slider_startingpoint = driver.findElement(By.xpath("//input[@type='range']"));
          System.out.println( "Default Location Value :"+slider_startingpoint.getAttribute("value")); //0
          System.out.println( "Default Location :"+ slider_startingpoint.getLocation());  //155,164           
          act.clickAndHold(slider_startingpoint).moveByOffset(50, 0).release().perform();
         System.out.println("After move  Location Value :"+slider_startingpoint.getAttribute("value")); //4.5
          System.out.println( "After move  Location :"+ slider_startingpoint.getLocation()); //155,164
          
    //Range Slider:(two thumb/handles is present)>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
           /* Both Slider and  Thumb/Handle both are different elements.
             Description: A slider with two thumbs (handles) that allow the user to select a range between two values.
             Use Case: Often used for filtering data within a range, like price filters in e-commerce websites.
           */
      
         driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        WebElement s_point=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println("Starting point Default location is :"+s_point.getLocation()); //59,249
        act.dragAndDropBy(s_point, 80, 0).perform(); //y-axis we can enter 0 /249 both are correct
        System.out.println("Starting point  location after move  is :"+s_point.getLocation()); //140,249
        
       //Note : I have used 2 different methods for  move handle/thumb in start point &end point both are correct .
        
        WebElement e_point=driver.findElement(By.xpath("//span[2]"));
        System.out.println("Ending point Default location is :"+e_point.getLocation()); //510,249
        act.clickAndHold(e_point).moveByOffset(-70, 249).release().perform();  //y-axis we can enter 0 /249 both are correct
        System.out.println("Ending point After move location is :"+e_point.getLocation()); //437,249
        
	}

}
