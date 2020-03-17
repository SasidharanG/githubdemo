package com.StepDefinition;


import com.ExcelUtilitty.Task_Management_Exelulities;
import com.Pages.TaskManagement_DeleteTask;
import com.Pages.TaskManagement_DeleteTaskSearch;
import com.Pages.TaskManagement_EditTask;
import com.Pages.TaskManagement_EmployeeDatails;
import com.Pages.Task_Management_AddTask;
import com.Pages.Task_Management_Addemployee;
import com.Pages.Task_Management_Employeelogin;
import com.Pages.Task_Management_Login;
import com.Pages.Task_Management_PrintTaskList;
import com.Pages.Task_Management_PriorityTask;
import com.Pages.Task_Management_SearchClosed;
import com.Pages.Task_Management_TaskType;
import com.Pages.Task_Mangement_Search;
import com.Pages.Taskmanagement_SearchProject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task_Mangement_StepDefinition {
		//Creating Object for login Pages
		Task_Management_Login Tasklogin=new Task_Management_Login();
		//Creating Object for Excelulities
		Task_Management_Exelulities Taskexel = new Task_Management_Exelulities();
		//Creating Object for Add task
		Task_Management_AddTask Taskadd=new Task_Management_AddTask();
		//Creating Object for Search Task
		Task_Mangement_Search Tasksearch=new Task_Mangement_Search();
		//Creating Object for print Task list
		Task_Management_PrintTaskList Taskprint=new Task_Management_PrintTaskList();
		
		//Kalai Part
		TaskManagement_EditTask taskedit = new TaskManagement_EditTask();
		TaskManagement_DeleteTask taskdelete= new TaskManagement_DeleteTask();
		TaskManagement_DeleteTaskSearch deletesearch=new TaskManagement_DeleteTaskSearch();
		Taskmanagement_SearchProject searchproject = new Taskmanagement_SearchProject();
		TaskManagement_EmployeeDatails employee=new TaskManagement_EmployeeDatails();
		//Sasi part
		Task_Management_Addemployee addempl= new Task_Management_Addemployee();
		Task_Management_Employeelogin employeelogin= new Task_Management_Employeelogin();
		Task_Management_TaskType tasktype=new Task_Management_TaskType();
		Task_Management_SearchClosed taskclosed= new Task_Management_SearchClosed();
		Task_Management_PriorityTask priority= new Task_Management_PriorityTask();
		
//Login scenario methods 	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Tasklogin.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("^Clicking on Administration to nagivate Login Page$")
	public void clicking_on_Administration_to_nagivate_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Tasklogin.LoginPage();
	}

	@Then("^The user login using username and password with vaild and invaild deatils$")
	public void the_user_login_using_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Tasklogin.LoginDetails(Taskexel.Task_Management_username(1),Taskexel.Task_Management_password(1));
		Tasklogin.loginclick();
		    int count=Taskexel.row_count();
		    for(int i=2;i<=count;i++)
		    {
		    	Tasklogin.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		    	Tasklogin.LoginPage();
		    	Tasklogin.LoginDetails(Taskexel.Task_Management_username(i),Taskexel.Task_Management_password(i));
		    if (i==2) {
		    	Tasklogin.loginclick();
		    }
		    }
	}

	@Then("^Click on login Button$")
	public void click_on_login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Tasklogin.loginclick();
	}
//Add Task Scenario Methods
	@When("^Click AddTask and login$")
	public void click_AddTask_and_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Taskadd.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		Taskadd.LoginDetails(Taskexel.Task_Management_username(1),Taskexel.Task_Management_password(1));

	}
	@Then("^Clicking on AddTask to nagivate Add Task Page$")
	public void clicking_on_AddTask_to_nagivate_Add_Task_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Taskadd.TaskDeatils();
	}

	@Then("^Click on Addbutton to add Task$")
	public void click_on_Addbutton_to_add_Task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Taskadd.AddTask();
	}
//Search Scenario Methods
	@Then("^Enter Correct Details to search$")
	public void enter_Correct_Details_to_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Tasksearch.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		Tasksearch.searchdetails();
	}

	@Then("^Click Search Button to Get Details$")
	public void click_Search_Button_to_Get_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Tasksearch.search();
	}
//Print Scenario Methods
	@Then("^Print the home page Task Table in the console$")
	public void print_the_home_page_Task_Table_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Taskprint.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");	
		Taskprint.printtable();
	}

	
	
//Kalai Part
	@When("^Click any task from the Tasks list$")
	public void click_any_task_from_the_Tasks_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskedit.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");	
		taskedit.select_task();
		taskedit.login();
	}

	@Then("^Edit any one field from Add/Edit task$")
	public void edit_any_one_field_from_Add_Edit_task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskedit.Edit();
	}

	@Then("^Click on submit Button$")
	public void click_on_submit_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  taskedit.submit(); 
	}
//TaskManagement Delete
	@When("^Click any task from tasks list$")
	public void click_any_task_from_tasks_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskdelete.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		taskdelete.select_task();
		taskdelete.login();
	}

	@Then("^Click delete button to delete details$")
	public void click_delete_button_to_delete_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		taskdelete.delete();
	}
	
//Searching Deleted deatils is there are not
	@When("^Fill the deleted details in Search box$")
	public void fill_the_deleted_details_in_Search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletesearch.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		deletesearch.searchdata();
	}

	@Then("^Click the search button$")
	public void click_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletesearch.submit();
	}

	@Then("^Print the search result$")
	public void print_the_search_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletesearch.print();
	}
//Search the Codecharge project
	@When("^Search as Codecharge in Project$")
	public void click_dropdown_box_in_project_from_search_and_select_codecharge() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchproject.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		searchproject.searchproject();
	}

	@Then("^click on the search button get the result$")
	public void click_on_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchproject.submit();  
	}
//get the employee deatils
	@When("^Clicking Adminstration$")
	public void clicking_Adminstration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employee.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		employee.adminstration();
	}

	@Then("^Click on employee details$")
	public void click_on_employee_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employee.employe();
	}

	@Then("^Print the anyone Employees list in the console$")
	public void print_the_anyone_Employees_list_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		employee.printemp();
	}
	
//Sasi Part
	//AddEmployee
	@When("^the user click on Administartion and Login is proceeded$")
	public void the_user_click_on_Administartion_and_Login_is_proceeded() throws Throwable {
		addempl.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		addempl.administartion();
	   
	}

	@Then("^the user click on Employee field$")
	public void the_user_click_on_Employee_field() throws Throwable {
		addempl.employee();
	   
	}

	@Then("^the user click on Add Employee field and enter the credentials$")
	public void the_user_click_on_Add_Employee_field_and_enter_the_credentials() throws Throwable {
		addempl.employee_details();
	}

	@And("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
		addempl.add();
	}
	
//Check employee login
	
	@When("^the user click on Administration tab$")
	public void the_user_click_on_Administration_tab() throws Throwable {
		employeelogin.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		employeelogin.Administration();
	    
	}

	@Then("^the user enters login credentials and clicks login$")
	public void the_user_enters_login_credentials_and_clicks_login() throws Throwable {
		employeelogin.Login_check();
	    
	}
	
//add Hold type in task
	
	@When("^the user click  Administration tab and do valid login$")
	public void the_user_click_Administration_tab_and_do_valid_login()  
	{
		tasktype.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		tasktype.administration();
	}

	@Then("^the user click on Types field and clicks Add New Type$")
	public void the_user_click_on_Types_field_and_clicks_Add_New_Type() {
		tasktype.type();
	    
	}

	@Then("^the user enters Type Name and submit$")
	public void the_user_enters_Type_Name() throws InterruptedException  {
		tasktype.Add_type();
	    
	}
// Search Closed Status

@Then("^the status field is inspected and search button is clicked$")
public void the_status_field_is_inspected_and_search_button_is_clicked() throws Throwable {
	taskclosed.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	taskclosed.search_table();
   
}

//Print the priority table


@Then("^Priority field is inspected and search button should be clicked$")
public void priority_field_is_inspected_and_search_button_should_be_clicked()  
{
	priority.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	priority.priority();   
}

@And("^Print Task table$")
public void print_Task_table() throws InterruptedException  
{
	priority.print();   
}
	
	
	
}
