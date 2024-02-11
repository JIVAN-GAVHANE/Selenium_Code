package test;
//ITestListener = interface

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("i done with Listener");
	}
	
	

}
