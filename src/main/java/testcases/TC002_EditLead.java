package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.EditLeadPage;
import pages.FindLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import projectBase.ProjectSpecificMethods;

public class TC002_EditLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName="editlead";

	}
	@Test(dataProvider="fetchData")
	//@Test
	public void editLead(String userName,String passWord,String CompanyName,String ChangedComapnyName) throws InterruptedException {
			new LoginPage()
			.enterUsername(userName)
			.enterPassword(passWord)
			.clickLogin();
			new HomePage()
			.clickCrmSfa();
			new MyHomePage()
			.clickLeads();
			new MyLeadsPage()
			.clickFindLead();
			new FindLeadPage()
			.typefirstName()
			.clickFindLeads()
			.clickLeadID();
			new ViewLeadPage()
			.clickOnEdit();
			new EditLeadPage()
			.changeCompanyName(CompanyName)
			.clickUpdate();
			new ViewLeadPage()
			.verifyCompanyName(ChangedComapnyName);
			
			
	}
	
	
	

}
