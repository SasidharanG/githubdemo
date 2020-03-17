package com.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Task_Management_TestCase.Feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
tags = {"@TC_01_Login,@TC_02_Add_Task,@TC_03_Search_Task,@TC_04_Task_Table_Printing,@TC_05_Edit,@TC_06_Delete,@TC_07_Searching_Delete_Task,@TC_08_TaskList_Search,@Tc_09_Employees_list_printing,@TC_10_Add_Employee,@TC_11_Check_Login,@TC_12_Add_Hold_Type,@TC_13_search,@TC_14_Print,@TC_14_Print_the_priority_field"},
glue = {"com.StepDefinition"},
monochrome = true
)
public class Task_Mangement_Runner {
	}

