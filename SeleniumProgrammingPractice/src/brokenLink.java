

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class brokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
	/*
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respond=conn.getResponseCode();
		System.out.println(respond);
		*/
		
		List <WebElement>links=driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		//List<WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		 //SoftAssert a =new SoftAssert();
		
		for(WebElement link:links){
		String url= link.getAttribute("href");
		HttpURLConnection conn1=(HttpURLConnection)new URL(url).openConnection();
		conn1.setRequestMethod("HEAD");
		conn1.connect();
		int repond=conn1.getResponseCode();
		System.out.println(repond);
		//a.assertTrue(repond<400, "The link with Text"+link.getText()+" is broken with code" +repond);
		
		if(repond>400) {
			System.out.println("broken link text is"+link.getText()+"And Code is"+repond);
			Assert.assertTrue(false);
		}
		}
		driver.close();
	}

}
