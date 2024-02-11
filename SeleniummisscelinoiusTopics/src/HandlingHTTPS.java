import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHTTPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//desired capapbilities
		//general cchrome Profile //used to generate genral purpose script
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		
		//below to your local browser //used to set local browser seeting
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jivan Gavhane\\Desktop\\Selenium Rahul Shetty\\need\\Chrome Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
	}

}
