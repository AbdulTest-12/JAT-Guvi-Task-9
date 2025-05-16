package Task9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //Open the browser
		
	   WebDriver driver= new ChromeDriver();
	  
	   //Navigate to url
	   
	   driver.navigate().to("https://www.demoblaze.com/");
	    
	   //maximize the window
	   
	    driver.manage().window().maximize();
	    
	   //Verifying the Title
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    
	    if(title.equals("STORE")) {
	    	System.out.println("Page landed on correct website");
	    }
	    else {
	    System.out.println("Page not landed on correct website");
	   }
	    
	    
	}

}
