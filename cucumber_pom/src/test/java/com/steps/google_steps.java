package com.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.main_java.google_java;

public class google_steps {
	google_java google1 = new google_java();

	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() {
		google1.url();
	}
	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage() throws InterruptedException {
		google1.google_homepage();
	}

	@Then("^verify textbox$")
	public void verify_textbox() throws InterruptedException {
		google1.verify();
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() {
		google1.submit();

	}

}
