package pages;

import projectBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public MyHomePage clickCrmSfa() {
		
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
	
	
	
	
	
	
	
	
	
}
