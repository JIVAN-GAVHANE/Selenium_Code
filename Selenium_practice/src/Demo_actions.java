//import these jar from jars you added
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//third party browser resrtict the selenium to invoke there browser automatically for security so(need to invoke perticular .exe file first)
		//selenium guys set some properties for each browser (webdriver.chrome.driver)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		
		//creating object for chrome driver class //we are implementing methods prent in webdriver interface
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		/*optional
		driver.findElement(By.id("email")).sendKeys("9689274879");
		driver.findElement(By.name("email")).sendKeys("9689274879");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9689274879");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("9689274879");
		driver.findElement(By.cssSelector("input#email")).sendKeys("9689274879");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9689274879");
		driver.findElement(By.cssSelector("#email")).sendKeys("9689274879");
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("9689274879");
		*/
		
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook.com");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.linkText("Log into Facebook")).click();
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("9689274879");
		driver.findElement(By.name("pass")).sendKeys("tuberg@123");
		driver.findElement(By.cssSelector("[id='loginbutton']")).click();
		
		 /* demo_child d=new demo_child();
		System.out.println(d.practice());
		*/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.getPageSource();
		 
		
		driver.close();

	}

}
