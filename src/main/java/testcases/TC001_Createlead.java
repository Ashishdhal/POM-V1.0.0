package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import projectBase.ProjectSpecificMethods;

public class TC001_Createlead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="createlead";

	}
	@Test(dataProvider="fetchData")
	//@Test
	public void loginTestcase(String userName,String passWord,String Companyname,String Firstname,String Lastname) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(passWord)
		.clickLogin();
		new HomePage()
		.clickCrmSfa();
		new MyHomePage()
		.clickLeads();
		new MyLeadsPage()
		.clickCreateLead();
		new CreateLead()
		.typeCompanyName(Companyname)
		.typeFirstName(Firstname)
		.typeLirstName(Lastname)
		.ClickSubmit();
		new ViewLeadPage()
		.viewFirstName(Firstname);
		
		
		
		
		
		
		
		
		
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		HomePage hp = new HomePage();
		hp.clickLogout();*/
	}
	
	
	
	
	
	
	
	
	
}
