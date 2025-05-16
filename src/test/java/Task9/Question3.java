package Task9;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Open the browser
		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		//Navigate to Url
		driver.navigate().to("https://www.wikipedia.org/");
		//maximize the window
		driver.manage().window().maximize();
        //Searching Artificial Intelligence in search box and click the icon
		WebElement searchbox = driver.findElement(By.id("searchInput"));
		searchbox.click();
		searchbox.sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//Clicking History and Get the section title
		WebElement history = driver.findElement(By.xpath("//li[@id=\"toc-History\"]"));
		history.click();
		WebElement sectiontitle =driver.findElement(By.xpath("//h2[@id=\"History\"]"));
		System.out.println("The Title of the Section is " + sectiontitle.getText());

	}
}	


		   
