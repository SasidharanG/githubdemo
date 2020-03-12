package com.steps;

import com.main_java.google_java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class google_steps {
 google_java jack = new google_java();
 
 @Given("^the user launched the chrome browser$")
 public void the_user_launched_the_chrome_browser() throws Throwable {
	 jack.url();
    
     throw new PendingException();
 }

 @When("^the user opens Google Homepage$")
 public void the_user_opens_Google_Homepage() throws Throwable {
	 jack.google_homepage();
    
     throw new PendingException();
 }

 @Then("^the user enters \"([^\"]*)\"$")
 public void the_user_enters(String arg1) throws Throwable {
	 jack.verify();
     throw new PendingException();
 }

 @Then("^the user clicks search button$")
 public void the_user_clicks_search_button() throws Throwable {
     jack.search();
     throw new PendingException();
 }
}
