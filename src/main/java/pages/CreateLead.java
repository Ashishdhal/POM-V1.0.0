package pages;

import projectBase.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	
		public CreateLead typeCompanyName(String Cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
		return this;
		}
		
		public CreateLead typeFirstName(String Fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		return this;
		}
		
		public CreateLead typeLirstName(String Lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		return this;
		}
		
		public ViewLeadPage ClickSubmit(){
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
		}
	
	

}
