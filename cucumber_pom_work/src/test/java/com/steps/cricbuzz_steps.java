package com.steps;

import com.main_java.cricbuzz_java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cricbuzz_steps {
  
cricbuzz_java cricket = new cricbuzz_java();

@Given("^launch an chrome browser$")
public void launch_an_chrome_browser() throws Throwable {
   cricket.launchUrl();
    throw new PendingException();
}

@When("^the user opens Cricbuzz homepage$")
public void the_user_opens_Cricbuzz_homepage() throws Throwable {
   cricket.moveActions();
    throw new PendingException();
}

@Then("^the user moves to \"([^\"]*)\" icon$")
public void the_user_moves_to_icon(String arg1) throws Throwable {
  cricket.batsman();
    throw new PendingException();
}

@Then("^the user clicks \"([^\"]*)\"$")
public void the_user_clicks(String arg1) throws Throwable {
    cricket.quit();
    throw new PendingException();
}

}
