package demo_simpleproject.base;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static String Screenshotsubfoldername; // create variable for separate folder each time

	@BeforeTest
	public void beforeteststart() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

	public void forscreenshot(String testName) {

		if (Screenshotsubfoldername == null) { // use the below code from java date and time from w3 schools

			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyyHHmmss");
			Screenshotsubfoldername = myDateObj.format(myFormatObj);  // ****************IMP to change here the foldername
			// ****************IMP to change here the foldername
		}
		File srcssfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destssfile = new File("./srshots/" + Screenshotsubfoldername + "/" + testName);
		try {
			FileUtils.copyFile(srcssfile, destssfile);

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(" screenshot taken successfully for failed tests");

	}
	
	
	// Dhoom_without_listener_penetration_testng *** to run this testng, we need to add/enable this , because it don't have listeners
//	@AfterMethod
//	public void sscapture(ITestResult result) {
//		if(result.getStatus() == ITestResult.FAILURE) {
//			//any one line from listeners
//			forscreenshot(result.getTestContext().getName() + result.getName()+ ".jpg");
//		}
//		
//	}
	

}
