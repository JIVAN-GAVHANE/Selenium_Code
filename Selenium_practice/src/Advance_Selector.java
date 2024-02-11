import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Groww");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		
		//Locators practice using Css selector and Xpath 
		driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
		//driver.findElement(By.xpath("//h3[text()='Groww - Online Demat, Trading and Direct Mutual Fund ...']")).click();
		//driver.findElement(By.xpath("//h3[contains(text(),'Groww - Online Demat')]")).click();
		
		driver.close();

	}

}
