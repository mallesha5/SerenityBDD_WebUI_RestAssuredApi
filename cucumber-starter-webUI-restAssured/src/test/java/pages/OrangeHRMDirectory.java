package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMDirectory extends PageObject {
	
	public void directoryVerified()
	{
		$(By.id("menu_directory_viewDirectory")).click();
		
		System.out.println(getDriver().getTitle());
		System.out.println(getDriver().getCurrentUrl());
		Assert.assertTrue(getDriver().getTitle().contains("OrangeHRM"));
		Assert.assertTrue(getDriver().getCurrentUrl().contains("Directory"));
	}
	
	public void searchEmployee(String empName)
	{
		$(By.id("searchDirectory_emp_name_empName")).type(empName);
		$(By.id("resetBtn")).click();
	}
	
	public void clickLogout()
	{
		$(By.id("welcome")).click();
		$(By.partialLinkText("Logout")).click();
	}

}
