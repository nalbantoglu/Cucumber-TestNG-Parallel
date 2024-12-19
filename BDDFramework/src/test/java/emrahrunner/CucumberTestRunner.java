package emrahrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "src/test/resources/Features" },
		glue = { "emrahsteps" }, 
		plugin = { 
				
				"pretty",

				"html:target/htmlreport.html" }

) 

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
