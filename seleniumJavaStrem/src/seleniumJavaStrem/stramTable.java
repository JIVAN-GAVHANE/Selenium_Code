package seleniumJavaStrem;



import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stramTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver.exe");
		
		//creating object for chrome driver class //we are implementing methods prent in webdriver interface
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//table[@class='table table-bordered']//th[1]")).click();
		List<WebElement> veg=driver.findElements(By.xpath("//table[@class='table table-bordered']//td[1]"));
		
		List<String> originalList=veg.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//Assert.assertTrue(originalList.equals(sortedList));
		
		//grab the pric of 4 th veg
		List<Object> price=veg.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVegie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));	
		driver.close();

	}

	private static Object getPriceVegie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue=s.findElement(By.xpath("Following-sibling::td[1]")).getText();
		return priceValue;
	}

}
