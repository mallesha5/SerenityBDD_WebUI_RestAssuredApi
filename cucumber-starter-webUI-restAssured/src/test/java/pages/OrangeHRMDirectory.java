package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMDirectory extends PageObject {
	
	public void directoryVerified()
	{
		$(By.linkText("Directory")).click();
		
		System.out.println(getDriver().getTitle());
		System.out.println(getDriver().getCurrentUrl());
		Assert.assertTrue(getDriver().getTitle().contains("OrangeHRM"));
		Assert.assertTrue(getDriver().getCurrentUrl().contains("Directory"));
	}
	
	public void searchEmployee(String empName) throws Throwable
	{
		$(By.xpath("//div[contains(@class, \"oxd-autocomplete-text-input\")]/input")).type(empName);
		
		Thread.sleep(5000);
		String autoCompleteValue = getDriver().findElement(By.className("oxd-autocomplete-option")).getText();
		System.out.println("the auto complete text = "+autoCompleteValue);
		
		if (autoCompleteValue.equals("No Records Found")) {
			System.out.println("Not Found");	
		}
		else
		{
			getDriver().findElement(By.className("oxd-autocomplete-option")).click();
			getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(3000);
			String searchResultName = getDriver().findElement(By.className("orangehrm-directory-card-header")).getText();
			System.out.println("the result text is ="+searchResultName);
			System.out.println("Found");	
			getDriver().findElement(By.xpath("//button[@type=\"reset\"]")).click();
		}
		
	}
	
	public void clickLogout()
	{
		$(By.className("oxd-userdropdown-name")).click();
		$(By.linkText("Logout")).click();
	}

}
