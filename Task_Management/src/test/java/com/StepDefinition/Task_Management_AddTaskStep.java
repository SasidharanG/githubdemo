package com.StepDefinition;

import com.ExcelUtilitty.Task_Management_Exelulities;
import com.Pages.Task_Management_AddTask;
import com.Pages.Task_Management_Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task_Management_AddTaskStep {
	Task_Management_Exelulities exel = new Task_Management_Exelulities();
	Task_Management_AddTask Ta=new Task_Management_AddTask();
	@Given("^User launch the Chrome application$")
	public void user_launch_the_Chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Ta.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("^Click AddTask and login$")
	public void click_Administration_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Ta.LoginDetails(exel.Task_Management_username(1),exel.Task_Management_password(1));
	
	}

	@Then("^Clicking on AddTask to nagivate Add Task Page$")
	public void clicking_on_AddTask_to_nagivate_Add_Task_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Ta.TaskDeatils();
	}

	@Then("^Click on Addbutton to add Task$")
	public void click_on_Addbutton_to_add_Task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Ta.AddTask();
	}

}
