package pages;

import projectBase.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{

	public EditLeadPage changeCompanyName(String Cname) {
		//
		
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(Cname);
		
		//driver.findElementByName("companyName").clear();
		//driver.findElementByName("companyName").sendKeys("BrighterMinds");
		return this;
	}
	public ViewLeadPage clickUpdate() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
		
		
	}

}
