$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/TestCase.Feature");
formatter.feature({
  "line": 2,
  "name": "Task_Management Website",
  "description": "",
  "id": "task-management-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Task_Management"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Login into Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01_Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Clicking on Administration to nagivate Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The user login using username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 10251308089,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.clicking_on_Administration_to_nagivate_Login_Page()"
});
formatter.result({
  "duration": 1626815935,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 26503394119,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_on_login_Button()"
});
formatter.result({
  "duration": 1088809131,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "Add Task in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02_Add_Task"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Click AddTask and login",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Clicking on AddTask to nagivate Add Task Page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Addbutton to add Task",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_AddTask_and_login()"
});
formatter.result({
  "duration": 14460225423,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.clicking_on_AddTask_to_nagivate_Add_Task_Page()"
});
formatter.result({
  "duration": 7591386813,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_on_Addbutton_to_add_Task()"
});
formatter.result({
  "duration": 6118454240,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "Searching in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC_03_Search_Task"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Enter Correct Details to search",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click Search Button to Get Details",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.enter_Correct_Details_to_search()"
});
formatter.result({
  "duration": 6007323492,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_Search_Button_to_Get_Details()"
});
formatter.result({
  "duration": 6561191723,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "Printing Task Table in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC_04_Task_Table_Printing"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Print the home page Task Table in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.print_the_home_page_Task_Table_in_the_console()"
});
formatter.result({
  "duration": 12338857920,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "",
  "description": "Add/Edit Task in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@TC_05_Edit"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Click any task from the Tasks list",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Edit any one field from Add/Edit task",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Click on submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_any_task_from_the_Tasks_list()"
});
formatter.result({
  "duration": 8757828367,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.edit_any_one_field_from_Add_Edit_task()"
});
formatter.result({
  "duration": 223816042,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_on_submit_Button()"
});
formatter.result({
  "duration": 9102096056,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "",
  "description": "Deleting a Task in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@TC_06_Delete"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "Click any task from tasks list",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Click delete button to delete details",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_any_task_from_tasks_list()"
});
formatter.result({
  "duration": 8986001748,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_delete_button_to_delete_details()"
});
formatter.result({
  "duration": 4150094749,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "",
  "description": "Checking Deleted details is show are not in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@TC_07_Searching_Delete_Task"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "Fill the deleted details in Search box",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Click the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Print the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.fill_the_deleted_details_in_Search_box()"
});
formatter.result({
  "duration": 6073686814,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_the_search_button()"
});
formatter.result({
  "duration": 957688243,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.print_the_search_result()"
});
formatter.result({
  "duration": 3203281612,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "",
  "description": "Searching Project in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@TC_08_TaskList_Search"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "Search as Codecharge in Project",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "click on the search button get the result",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_dropdown_box_in_project_from_search_and_select_codecharge()"
});
formatter.result({
  "duration": 6492592656,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_on_the_search_button()"
});
formatter.result({
  "duration": 6302988612,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "",
  "description": "  Printing anyone user from employee Deatils in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@Tc_09_Employees_list_printing"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "Clicking Adminstration",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "Click on employee details",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Print the anyone Employees list in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.clicking_Adminstration()"
});
formatter.result({
  "duration": 8768838709,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.click_on_employee_details()"
});
formatter.result({
  "duration": 543136394,
  "status": "passed"
});
formatter.match({
  "location": "Task_Mangement_StepDefinition.print_the_anyone_Employees_list_in_the_console()"
});
formatter.result({
  "duration": 5459797956,
  "status": "passed"
});
});