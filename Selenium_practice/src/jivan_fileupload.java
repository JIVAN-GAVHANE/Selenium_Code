import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jivan_fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		
		WebElement fileupload=driver.findElement(By.cssSelector("[name='upfile']"));
		
		fileupload.sendKeys("jivan1.txt");
	
		driver.findElement(By.cssSelector("[name='note']")).sendKeys("Upload practice");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}

}
