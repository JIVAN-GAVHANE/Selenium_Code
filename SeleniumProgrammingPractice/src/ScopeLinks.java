import java.util.Iterator;
import java.util.Set;
//need to view more time


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columLink=footerDriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul"));
		System.out.println(columLink.findElements(By.tagName("a")).size());
		
		for(int i = 1;i<columLink.findElements(By.tagName("a")).size();i++) {
		
			String clickOnLinkApp=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columLink.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkApp);
			//driver.navigate().back();
			}
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> abc=windows.iterator();
		
		while(abc.hasNext()) {
			driver.switchTo().window(abc.next());
			System.out.println(driver.getTitle());
		}
		driver.close();
		driver.quit();
	}

}
