@Task_Management
Feature: Task_Management Website
@TC_01_Login
Scenario:
	Login into Task_Mangement Website
Given the user launch the chrome application
When Clicking on Administration to nagivate Login Page
Then The user login using username and password
Then Click on login Button

@TC_02_Add_Task
Scenario:
	Add Task in Task_Mangement Website
Given User launch the Chrome application
When Click AddTask and login
Then Clicking on AddTask to nagivate Add Task Page
Then Click on Addbutton to add Task

@TC_03_Search_Task
Scenario:
	Searching in Task_Mangement Website
Given Launch the Chrome application
Then Enter Correct Details to search
Then Click Search Button to Get Details

@TC_04_Task_Table_Printing
Scenario:
	Printing Task Table in Task_Mangement Website
Given Launching the Chrome application
Then Print the home page Task Table in the console



