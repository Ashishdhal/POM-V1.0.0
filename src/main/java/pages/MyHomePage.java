package pages;

import projectBase.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyLeadsPage clickLeads() {
		
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}
	
	

}
