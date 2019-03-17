package com.w2a.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.Page;
import com.w2a.utilities.Utilities;

public class CustomListeners extends Page implements ITestListener{

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("Click to see Screenshot");
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+ "Failed with exception : "+arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.screenshotName));
		Reporter.log("<a target=\"_blank\" href = "+Utilities.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href = "+Utilities.screenshotName+"><img src="+Utilities.screenshotName+" height=200 width=200></a>");
		
		rep.endTest(test);
		rep.flush();
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(LogStatus.SKIP, arg0.getName().toUpperCase()+"Skippend the test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		test = rep.startTest(arg0.getName().toUpperCase());

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+ "PASS");
		rep.endTest(test);
		rep.flush();
		
	}
	
	

}
