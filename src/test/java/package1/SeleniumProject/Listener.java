package package1.SeleniumProject;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	static RemoteWebDriver driver;
	@Override
	public void onTestStart(ITestResult result)  {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		TakesScreenshot t1= driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\selenium SS\\Pass\\"+"pass"+Math.random()+".png");
		try 
		{
			FileHandler.copy(source, destination);
		} catch (IOException e)
		{
			e.printStackTrace();
		}	
		Reporter.log("Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case failed");
		System.out.println("Failed");
		TakesScreenshot t1=  driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\selenium SS\\Fail\\"+"fail"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e1)
		{
			System.out.println("ok");
			e1.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {

	}
}
