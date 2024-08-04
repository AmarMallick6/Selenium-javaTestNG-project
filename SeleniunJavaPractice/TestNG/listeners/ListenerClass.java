/**
 * 
 */
package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * 
 */

public class ListenerClass implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println(context. getName()+"Test Started");
	}

	public void onTestStart(ITestResult result) {
		System.out.println(result. getName()+"Test Started inside the Class");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result. getName()+"Test Started inside the Class is Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result. getName()+"Test Started inside the Class is Failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result. getName()+"Test Started inside the Class is Skiped");
	}

	public void onFinish(ITestContext context) {
		System.out.println(context. getName()+"Test Finished");
	}

}
