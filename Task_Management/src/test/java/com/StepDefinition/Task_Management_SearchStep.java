package com.StepDefinition;

import com.Pages.Task_Mangement_Search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task_Management_SearchStep {
	Task_Mangement_Search tms=new Task_Mangement_Search();
	
	@Given("^Launch the Chrome application$")
	public void launch_the_Chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	tms.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}

	@Then("^Enter Correct Details to search$")
	public void enter_Correct_Details_to_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	tms.searchdetails();
	}

	@Then("^Click Search Button to Get Details$")
	public void click_Search_Button_to_Get_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		tms.search();
	}

}
