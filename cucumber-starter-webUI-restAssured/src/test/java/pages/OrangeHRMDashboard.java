package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMDashboard extends PageObject {
	
	public void loginVerified()
	{
		System.out.println(getDriver().getTitle());
		System.out.println(getDriver().getCurrentUrl());
		Assert.assertTrue(getDriver().getTitle().contains("OrangeHRM"));
		Assert.assertTrue("Dashboard page not displayed",getDriver().getCurrentUrl().contains("1dashboard"));
	}
}
