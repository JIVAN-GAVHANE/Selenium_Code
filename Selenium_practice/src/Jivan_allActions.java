import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jivan_allActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("jivan manohar gavhane");
		WebElement dropdown=driver.findElement(By.cssSelector("#dropdown-class-example"));
		
		Select dropdown1=new Select(dropdown);
		dropdown1.selectByVisibleText("Option2");
		
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("jivan gavhane");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
	}

}
