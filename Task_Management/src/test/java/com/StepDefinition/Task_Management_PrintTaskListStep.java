package com.StepDefinition;

import com.Pages.Task_Management_PrintTaskList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task_Management_PrintTaskListStep {
	Task_Management_PrintTaskList tmp=new Task_Management_PrintTaskList();
	@Given("^Launching the Chrome application$")
	public void launching_the_Chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	tmp.ChromeLaunch("chrome","http://examples.codecharge.com/TaskManager/Default.php"); 
	}

	@Then("^Print the home page Task Table in the console$")
	public void print_the_Task_Table_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	tmp.printtable();
	}


}
