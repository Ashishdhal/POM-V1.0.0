package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import projectBase.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	///Edit lead........
	
	public void viewFirstName(String Fname) {
		WebElement table = driver.findElementByXPath("(//div[@class='fieldgroup-body'])[1]/table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement row2 = rows.get(1);
		List<WebElement> cols = row2.findElements(By.tagName("td"));
		String text = cols.get(1).getText();
		System.out.println("first name: "+text);
		if(text.equalsIgnoreCase(Fname)) {
			System.out.println("First name is matching !!!!");
		}
		else
			System.out.println("First name is not matching");
		
	}
	
	public EditLeadPage clickOnEdit() {
		
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
	}
	
	public void verifyCompanyName(String ChangedCompanyName) {
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		
		if (text.contains(ChangedCompanyName)) {
			System.out.println("Company name matched !!!");
		}else
			System.out.println("Company name not matched");
		
	}
	
	////Delete lead................
	
	public ViewLeadPage captureLeadId() {
		System.out.println("Lead id : "+driver.findElementByXPath("(//a[@class='linktext'])[4]").getText());
		return this;
	}
	public MyLeadsPage clickDelete() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
		
	}
	

}
