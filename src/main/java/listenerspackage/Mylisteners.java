package listenerspackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

import demo_simpleproject.base.Baseclass;

public class Mylisteners extends Baseclass implements ITestListener {

//	ExtentReports ggg = Erepoclass.ExtentRepo();
//	ExtentTest hhh;

//	public void onTestStart(ITestResult result) {
//
////		String testName = result.getName();
////		hhh = ggg.createTest(testName);
////		hhh.log(Status.INFO, testName + " execution started");
//
//	}
//
//	public void onTestSuccess(ITestResult result) {
//		String testName = result.getName();
//		hhh = ggg.createTest(testName);
//		hhh.log(Status.PASS, testName + " is test success");
//
//	}

	public void onTestFailure(ITestResult result) {

		// getName = it gets the method name
		// getTestContext , getName  == it get the testname and methodname
		// all below things works
//		forscreenshot(result.getName()+ ".jpg");
		// OR
		System.out.println(result.getTestContext().getName() + "_" + result.getName()+ ".jpg");
		forscreenshot(result.getTestContext().getName() + result.getName()+ ".jpg");
		// OR
//		forscreenshot(result.getTestContext().getName() + "_" + result.getName()+ ".jpg");
	}

//	public void onTestSkipped(ITestResult result) {
//
//		String testName = result.getName();
//		hhh = ggg.createTest(testName);
//		hhh.log(Status.INFO, "this test is skipped");
//	}
//
//	public void onFinish(ITestContext context) {
//
//		ggg.flush();
//
//	}

}
