import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Question 1
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		
		
		//Question 2
		//driver.findElement(By.cssSelector("input[value='checkbox']")).getSize();
		
		driver.close();
	}

}
