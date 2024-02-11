


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		//date 25
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("September")){
			driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='next']")).click();
		}
		
		List<WebElement> days=driver.findElements(By.cssSelector(".day"));
		int count=driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0;i<count;i++) {
			String pDate=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(pDate.equalsIgnoreCase("11")) {
			driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		driver.close();
	}

}


