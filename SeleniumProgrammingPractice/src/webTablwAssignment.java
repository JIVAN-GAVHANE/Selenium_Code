import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class webTablwAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#!");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//1.print number of rows
		int rows=driver.findElements(By.xpath("(//table[@id='product'])[1]//tr")).size();
		System.out.println(rows);
		
		//2.print number of qual
		int col=driver.findElements(By.xpath("(//table[@id='product'])[1]//th")).size();
		System.out.println(col);
		
		//3.print data of 2rd row
		String rowData=driver.findElement(By.xpath("(//table[@id='product'])[1]//tr[3]")).getText();
		System.out.println(rowData);
		
		WebElement table=driver.findElement(By.id("product"));
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		driver.close();
	}

}
