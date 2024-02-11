import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jivan_DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		
		WebElement dragable=driver.findElement(By.xpath("//div[@id='todrag']/span[2]"));
		
		WebElement dragspace=driver.findElement(By.id("mydropzone"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(dragable, dragspace).build().perform();
		//driver.close();
	}

}
