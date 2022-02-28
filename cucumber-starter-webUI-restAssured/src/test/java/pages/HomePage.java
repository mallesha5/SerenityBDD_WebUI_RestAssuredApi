package pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	OrangeHRMHomePage homePage;
	
	@Step
	public void openApplication()
	{
		homePage.open();
	}
	
	@Step
	public void enterUsername(String username)
	{
		homePage.enterUname(username);
	}
	
	@Step
	public void enterPassword(String password)
	{
		homePage.enterPassword(password);
	}
	
	@Step
	public void clickOnLoginButton()
	{
		homePage.clickLogin();
	}

}
