@Task_Management
Feature: Task_Management Website

@TC_01_Login
Scenario:
	Login into Task_Mangement Website
Given the user launch the chrome application
When Clicking on Administration to nagivate Login Page
Then The user login using username and password with vaild and invaild deatils
Then Click on login Button

@TC_02_Add_Task
Scenario:
	Add Task in Task_Mangement Website
Given Click AddTask and login
Then Clicking on AddTask to nagivate Add Task Page
Then Click on Addbutton to add Task

@TC_03_Search_Task
Scenario:
	Searching in Task_Mangement Website
Then Enter Correct Details to search
Then Click Search Button to Get Details

@TC_04_Task_Table_Printing
Scenario:
	Printing Task Table in Task_Mangement Website
Then Print the home page Task Table in the console

@TC_05_Edit
Scenario:
	Add/Edit Task in TaskMangement Website
When Click any task from the Tasks list
Then Edit any one field from Add/Edit task
Then Click on submit Button

@TC_06_Delete
Scenario:
	Deleting a Task in TaskMangement Website
When Click any task from tasks list
Then Click delete button to delete details

@TC_07_Searching_Delete_Task
Scenario:
  Checking Deleted details is show are not in TaskMangement Website
When Fill the deleted details in Search box
Then Click the search button
Then Print the search result

@TC_08_TaskList_Search
Scenario:
	Searching Project in TaskMangement Website
When Search as Codecharge in Project
Then click on the search button get the result

@Tc_09_Employees_list_printing
Scenario:
    Printing anyone user from employee Deatils in TaskMangement Website
When Clicking Adminstration
Then Click on employee details
Then Print the anyone Employees list in the console

@TC_10_Add_Employee
Scenario:
      Add New Employee in Employee list
 When the user click on Administartion and Login is proceeded
 Then the user click on Employee field 
 Then the user click on Add Employee field and enter the credentials
 And click on Add button

@TC_11_Check_Login
Scenario:
    To check the added employee getting logged in
 When the user click on Administration tab
 Then the user enters login credentials and clicks login

@TC_12_Add_Hold_Type
 Scenario:
      To add Hold Type
 When the user click  Administration tab and do valid login
 Then the user click on Types field and clicks Add New Type
 Then the user enters Type Name and submit

@TC_13_search_closed_status
Scenario:
   To search closed status 
Then the status field is inspected and search button is clicked

@TC_14_Print_the_priority_field
Scenario:
Then Priority field is inspected and search button should be clicked
And Print Task table

