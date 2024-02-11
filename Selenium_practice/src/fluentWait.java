import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,5);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.findElement(By.xpath("//a[contains(text(),'Example 1')]")).click();
		driver.findElement(By.xpath("//div[@id='start']//button")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).
		
	}

}
