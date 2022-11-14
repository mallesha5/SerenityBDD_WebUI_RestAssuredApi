package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject {
	
	public void enterUname(String username)
	{
		$(By.name("username")).type(username);
	}
	
	public void enterPassword(String password)
	{
		$(By.name("password")).type(password);
	}
	
	public void clickLogin()
	{
		$(By.className("oxd-button")).click();
	}

}
