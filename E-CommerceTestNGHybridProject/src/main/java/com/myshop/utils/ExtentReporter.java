package com.myshop.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReporter {
	
	public  static ExtentReports generateExtentReports() {
		ExtentReports xtentreport= new ExtentReports();
		
		File extentreportFile= new File(System.getProperty("user.dir")+"/test-output/ExtentReporters/extentreport.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentreportFile);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("My Shop  Test Result");
		sparkReporter.config().setDocumentTitle("My-Shop Automation Test Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		xtentreport.attachReporter( sparkReporter );
		
		
		  Properties prop = new Properties(); 
		  try { FileInputStream fis = new
		  FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/myshop/configfile/configuration.properties");
		  prop.load(fis); 
		  } catch (Throwable e) 
		  { e.printStackTrace();
		  }
		 
		xtentreport.setSystemInfo("Application URL :", prop.getProperty("baseurl"));
		xtentreport.setSystemInfo("Browser Name :", prop.getProperty("browsername"));
		xtentreport.setSystemInfo("JAVA VERSION ", System.getProperty("java.version"));
		xtentreport.setSystemInfo(" Operating System",System.getProperty("os.name") );
		xtentreport.setSystemInfo(" User Name",System.getProperty("user.name") );
		
		return xtentreport;
	}
	

}
