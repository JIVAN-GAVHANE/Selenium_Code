package test;

import org.testng.annotations.Test;

public class runTestNG2 {

	@Test(groups= {"smoke"})
	public void run() {
		System.out.println("hello2");
	}

}
