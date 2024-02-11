package test;

import org.testng.annotations.Test;



public class runTestNG {

	@Test(enabled=false)
	public void Test() {
		System.out.println("hello world");
	}
	
	@Test(dependsOnMethods= {"Test2"})
	public void Test1() {
		System.out.println("hello world 1");
	}
	
	@Test(timeOut=4000)
	public void Test2() {
		System.out.println("hello world 2");
	}
}
