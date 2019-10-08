package pages;

import java.util.concurrent.TimeUnit;

import projectBase.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	
	
	///////Edit lead..........................
	
	public FindLeadPage typefirstName() {
		
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Ashish");	
	return this;	
	}
	public FindLeadPage clickFindLeads() {
	
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	return this;	

	}
	public ViewLeadPage clickLeadID() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();	
	//driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
   //driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	//(//a[@class='linktext'])[4]
	//driver.findElementByLinkText("10031").click();
	//driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=10949'])[1]")).click();
		
	return new ViewLeadPage();
	}
	
	//Delete lead....................
	
	public FindLeadPage clickPhone() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;
	}
	public FindLeadPage enterAreaCode() {
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("02");
		return this;
	}
	public FindLeadPage enterPhoneNumber() {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("0987456321");
		return this;
	}
	public void clickDeletedLeadID() {
		driver.findElementByXPath("//input[@name='id']").sendKeys("10065");
	}
	public void checkLeadExistance() {
		
		String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (text.contains("No records to display")) {
		System.out.println("Lead is deleted");
		}else
		System.out.println("Lead is not deleted");
	}
	
}
