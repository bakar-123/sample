package demo_simpleproject.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import demo_simpleproject.base.Baseclass;
import demo_simpleproject.util.Utilityclass;

public class Login extends Baseclass {

	@Test(priority = 0, testName = "validlogintest")

	public void loginwithvalidcred() {

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("arms@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Assert.assertTrue(
				driver.findElement(By.xpath("//a[contains(text(),'Edit your account information')]")).isDisplayed());

	}

	@Test(priority = 1, testName = "INvalidlogintest")

	public void loginwithINvalidcred() {

		Utilityclass UCm = new Utilityclass();

		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys(UCm.DAte() + "@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String actloginwarningmsg = driver
				.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText();
		String exploginwarningmsg = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actloginwarningmsg.contains(exploginwarningmsg), " login credentials are not valid ");

	}
}
