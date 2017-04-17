package stepDefinitions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.And;
import com.aventstack.extentreports.gherkin.model.Given;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.gherkin.model.Then;
import com.aventstack.extentreports.gherkin.model.When;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class InvalidGmailSignin 
{
	ExtentReports extent;
	
	@BeforeClass
	public void IntializeBDDreport()
	{
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\phani.kanth.sayana\\Desktop\\cucumber BDD report.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	}
	
	@AfterClass()
	public void GenerateReport()
	{
		extent.flush();
	}
	
  @Test
  public void Invalidusername() 
  {
	  ExtentTest feature = extent.createTest("Invalid Gmail Signin");
	  ExtentTest scenario = feature.createNode(Scenario.class, "Invalid username");
	  
	  if(the_user_is_on_gmail_sign_in_page())
	  scenario.createNode(Given.class, "The user is on gmail sign in page").pass("pass");
	  else
	scenario.createNode(Given.class, "The user is on gmail sign in page").fail("fail");  
	  
	  if(an_Invalid_input_is_given_for_username_field())
	  scenario.createNode(When.class, "An Invalid input is given for username field").pass("pass");
	  else
	scenario.createNode(When.class, "An Invalid input is given for username field").fail("fail");
	  
	  if(the_user_clicks_on_Next_button())
	  scenario.createNode(And.class, "The user clicks on Next button").pass("pass");
	  else
	scenario.createNode(And.class, "The user clicks on Next button").fail("fail");
	  String actual="";
	  String expected = "";
	  if(error_message_should_be_displayed(actual,expected))
	  scenario.createNode(Then.class, "\"Please enter a valid email address or phone number.\" error message should be displayed").pass("pass");
	  else
	scenario.createNode(Then.class, "\"Please enter a valid email address or phone number.\" error message should be displayed").fail("fail");
  }
  
  @Test
  public void Invalidpassword()
  {
	  ExtentTest feature = extent.createTest("Invalid Gmail Signin");
	  ExtentTest scenario = feature.createNode(Scenario.class, "Invalid password");
	  
	  if(the_user_is_on_gmail_sign_in_page())
	  scenario.createNode(Given.class, "The user is on gmail sign in page").pass("pass");
	  else
	scenario.createNode(Given.class, "The user is on gmail sign in page").fail("fail");  
	  
	  if(a_valid_input_is_given_for_username_field())
	  scenario.createNode(When.class, "A valid input is given for username field").pass("pass");
	  else
	scenario.createNode(When.class, "A valid input is given for username field").fail("fail");
	  
	  if(the_user_clicks_on_Next_button())
	  scenario.createNode(And.class, "The user clicks on Next button").pass("pass");
	  else
	scenario.createNode(And.class, "The user clicks on Next button").fail("fail");
	  
	  if(an_Invalid_input_is_given_for_password_field())
		  scenario.createNode(And.class, "An Invalid input is given for password field").pass("pass");
		  else
		scenario.createNode(And.class, "An Invalid input is given for password field").fail("fail");
	  
	  String actual="";
	  String expected = "";
	  
	  if(error_message_should_be_displayed(actual,expected))
	  scenario.createNode(Then.class, "\"Wrong password. Try again.\" error message should be displayed").pass("pass");
	  else
	scenario.createNode(Then.class, "\"Wrong password. Try again.\" error message should be displayed").fail("fail");
  }
  
  public boolean the_user_is_on_gmail_sign_in_page()
  {
	  //implement webdriver functionalities here
	  return true;
  }

  
  public boolean an_Invalid_input_is_given_for_username_field() 
  {
	//implement webdriver functionalities here
	  return true;  
  }

  
  public boolean the_user_clicks_on_Next_button()
  {
	//implement webdriver functionalities here
    return true;
  }

  
  public boolean error_message_should_be_displayed(String actual,String exptected)
  {
	//implement webdriver functionalities here
	  if(actual.equals(exptected))
	    return true;
	  else
		  return false;
  }

  
  public boolean a_valid_input_is_given_for_username_field()
  {
	//implement webdriver functionalities here
	    return true;
  }

 
  public boolean an_Invalid_input_is_given_for_password_field()
  {
	//implement webdriver functionalities here
	    return false;
  }

  
  
  
  
  
  
  
  
}
