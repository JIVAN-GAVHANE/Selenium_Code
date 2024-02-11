import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollToView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000L);
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=5000");
		int sum=0;
		List<WebElement> Amount=driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[4]"));
		
		for(int i=0;i<Amount.size();i++) {
			sum=sum+Integer.parseInt(driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[4]")).get(i).getText());
		}
		System.out.println(sum);
		
		String TotalAmount=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		String Amount1=TotalAmount.split(":")[1];
		int finalAmount=Integer.parseInt(Amount1.trim());
		//System.out.println(finalAmount);
		
		Assert.assertEquals(sum, finalAmount);
		if(sum==finalAmount) {
			System.out.println("Amount are same");
		}else {
			System.out.println("Amount are not same");
		}
		driver.close();
		
	}

}
