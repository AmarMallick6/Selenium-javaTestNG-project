package com.myshop.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ShopListeners implements ITestListener {
	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		     String TestName = result.getName()	;	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		  String TestName = result.getName()	;	
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		  String TestName = result.getName()	;	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		  String TestName = result.getName()	;	
	
	}

	@Override
	public void onFinish(ITestContext context) {
	
		
	}

}
