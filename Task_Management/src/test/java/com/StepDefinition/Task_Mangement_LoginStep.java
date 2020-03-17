package com.StepDefinition;


import com.ExcelUtilitty.Task_Management_Exelulities;
import com.Pages.Task_Management_Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task_Mangement_LoginStep {
	Task_Management_Login tm=new Task_Management_Login();
	Task_Management_Exelulities exel = new Task_Management_Exelulities();
	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  tm.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("^Clicking on Administration to nagivate Login Page$")
	public void clicking_on_Administration_to_nagivate_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   tm.LoginPage();
	}

	@Then("^The user login using username and password$")
	public void the_user_login_using_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	  tm.LoginDetails(exel.Task_Management_username(1),exel.Task_Management_password(1));
	  tm.loginclick();
	    int count=exel.row_count();
	    for(int i=2;i<=count;i++)
	    {
	    tm.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	    tm.LoginPage();
	    tm.LoginDetails(exel.Task_Management_username(i),exel.Task_Management_password(i));
	    if (i==2) {
	    	 tm.loginclick();
	    }
	    }
	}

	@Then("^Click on login Button$")
	public void click_on_login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  tm.loginclick();
	}


}
