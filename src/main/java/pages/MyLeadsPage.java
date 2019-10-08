package pages;

import projectBase.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLead clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}
	public FindLeadPage clickFindLead()
	{
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();
		
	}
	

	
}
