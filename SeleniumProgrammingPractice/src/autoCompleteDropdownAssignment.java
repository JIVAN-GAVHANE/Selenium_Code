import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoCompleteDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

		   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		
		/*
		List<WebElement> country=driver.findElements(By.xpath("//li[@class='ui-menu-item']//div[1]"));
		
		for(WebElement option:country) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		//driver.close();
		 
		 */
		
	}

}
