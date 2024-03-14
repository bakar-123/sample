package listenerspackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

import demo_simpleproject.base.Baseclass;

public class p26listeners extends Baseclass implements ITestListener {

	public void onTestFailure(ITestResult result) {

		// getName = it gets the method name
		// getTestContext , getName == it get the testname and methodname
		// all below things works
//		forscreenshot(result.getName()+ ".jpg");
		// OR
		System.out.println(result.getTestContext().getName() + "_" + result.getName() + ".jpg");
		forscreenshot(result.getTestContext().getName() + result.getName() + ".jpg");
		// OR
//		forscreenshot(result.getTestContext().getName() + "_" + result.getName()+ ".jpg");
	}
	
	//*******Only for Failed Model WOrk********

}
