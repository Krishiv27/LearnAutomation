package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("******we are starting test: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(" ******test is sucess: " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(" ******test is Failed: " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" ******test is skipped: " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println(" ******test is on start: " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println(" ******test is on Finish: " + context.getName());
	}
	

}
