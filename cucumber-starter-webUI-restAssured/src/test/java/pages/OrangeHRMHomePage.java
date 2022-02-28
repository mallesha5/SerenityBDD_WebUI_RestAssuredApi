package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject {
	
	public void enterUname(String username)
	{
		$(By.id("txtUsername")).type(username);
	}
	
	public void enterPassword(String password)
	{
		$(By.id("txtPassword")).type(password);
	}
	
	public void clickLogin()
	{
		$(By.id("btnLogin")).click();
	}

}
