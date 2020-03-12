package cucumber1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrunner {
	@RunWith(Cucumber.class)				
	@CucumberOptions(features="Feature/testcase.feature",glue={"teststep"})
	public class featurework
	{	
	}

}
