package pages;

import net.thucydides.core.annotations.Step;

public class Directory {
	
	OrangeHRMDirectory directory;
	
	@Step
	public void verifyDirectoryPage()
	{
		directory.directoryVerified();
	}
	
	@Step
	public void searchEmployee(String empName)
	{
		directory.searchEmployee(empName);
	}
	
	@Step
	public void clickLogout()
	{
		directory.clickLogout();
	}

}
