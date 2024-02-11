package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class personalLoan {
	

	@AfterSuite
	public void afterSuit() { 
		System.out.println("After Suit");
	}
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Before every Method");
	}
	
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("After every method");
	}
	@AfterTest
	@Test
	public void peronal() {
		System.out.println("personal loan");
	}
	
	@BeforeTest
	@Test
	public void personal1() {
		System.out.println("personal1 loan");
	}
	
	@Test(groups={"smoke"})
	public void grop() {
		System.out.println("group");
	}
	
	@BeforeSuite
	public void Beforesuit() {
		System.out.println("before suit");
	}
}
