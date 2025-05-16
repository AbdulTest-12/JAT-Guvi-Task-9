package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open the  browser
		
		   WebDriver driver= new ChromeDriver();
     
     //Navigate to url
     driver.navigate().to("http://google.com");
     
     //maximize the window
     driver.manage().window().maximize();
     
     //reload the page
     driver.navigate().refresh();
     
     //Print the current page url
     String url = driver.getCurrentUrl();
     System.out.println(url);
     
     //reload the web page
     driver.navigate().refresh();  
     
     //Close the browser
     //driver.close();
	}
	

}
