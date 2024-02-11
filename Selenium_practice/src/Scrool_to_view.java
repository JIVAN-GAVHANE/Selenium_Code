import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrool_to_view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.cssSelector("#name"));
		
		Actions action=new Actions(driver);
		action.moveToElement(name);
		name.sendKeys("jivan gavhane");
		
		driver.findElement(By.id("date")).sendKeys("01/12/2005");
		//driver.close();
	}

}
