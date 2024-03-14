package extentpackage;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Erepoclass {
	
	public static ExtentReports ExtentRepo() {
		
		ExtentReports er = new ExtentReports();
		File f = new File(System.getProperty("user.dir")+"\\srshots\\image.html");
		ExtentSparkReporter  esr = new ExtentSparkReporter(f);
		er.attachReporter(esr);
		return (ExtentReports) er;
 	}

}
