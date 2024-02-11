package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class homeLoan {
	
	@Parameters({"URL","URL1"})
	@Test
	public void afterclass(String siteURL ,String siteURL1) {
		System.out.println(siteURL);
		System.out.println(siteURL1);
	}

	@Test(groups= {"smoke"})
	public void home() {
		System.out.println("homeLoan");
	}
	
	@Test(dataProvider="getData")
	public void beforeClass(String username,String Password) {
		System.out.println("before calss");
		System.out.println(username);
		System.out.println(Password);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st ;-username password ;-good credit history=row
		//2nd;-username password;-no credit history
		//3rd;-fraudelent credit history
		Object[][] data=new Object[3][2];
		data[0][0]="Username";
		data[0][1]="password";
		data[1][0]="username1";
		data[1][1]="password1";
		data[2][0]="username2";
		data[2][1]="password2";
		return data;
	}
	
}
