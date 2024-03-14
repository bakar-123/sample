package testcases;

import org.testng.annotations.Test;

import demo_simpleproject.base.Baseclass;
import demo_simpleproject.tests.Login;

public class TC_1 extends Baseclass {
	
	
	@Test(priority=0)
	public void run1() {
		Login L = new Login();
		L.loginwithvalidcred();
	}
	
	@Test(testName = "run2Test" , priority=1)
	public void run2() {
		Login L = new Login();
		L.loginwithINvalidcred();
	}
	

}
