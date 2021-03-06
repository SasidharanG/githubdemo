package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/TestCase.Feature",
plugin = {"pretty", "html:reports/cucumber-html-report"},
tags = {"@TC01_Mytra"},
glue = {"com.StepDefinition"},
monochrome = true
)
public class Task_Mangement_LoginRunner {

}
