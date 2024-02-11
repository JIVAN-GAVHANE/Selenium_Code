import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//select date
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--today']")).click();
		driver.findElement(By.xpath("div[class*='selected DayPicker-Day--today']")).click();
		
		//select Adult
		WebElement adultsCount=driver.findElement(By.xpath("https://www.cleartrip.com/"));	
		Select adult=new Select(adultsCount);
		adult.selectByIndex(3);
		
		//select Children
		WebElement childrenCount=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		Select children=new Select(childrenCount);
		children.selectByIndex(3);
		
		
		//click on link
		driver.findElement(By.xpath("//strong[text()='More options:']")).click();
		
		//select class of travel
		WebElement classtravel=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[4]"));
		Select travel=new Select(classtravel);
		travel.selectByIndex(2);
		
		//prefered airline
		driver.findElement(By.xpath("(//div[@class='p-relative'])[7]")).sendKeys("indigo");
		
		//Click on searchflight button
		driver.findElement(By.xpath("(//div[@class='mb-4'])[4]//button")).click();
		
		//get error message
		System.out.println(driver.findElement(By.xpath("//div[@class='col-24']//span")).getText());
		
		driver.close();
		
		
	}

}
