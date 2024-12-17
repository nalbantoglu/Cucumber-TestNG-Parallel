package emrahsteps;



import emrahbase.EmrahBaseClass;
import emrahutils.EmrahCommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class EmrahHooks extends EmrahCommonMethods{
	
	@Before
	public void start() {
		EmrahBaseClass.setUp();
	}
	
	 
	@After
	public void end(Scenario scenario) {
		
		byte[] screenshot;
		
		if(scenario.isFailed()) {
			//take a screenshot and put it under "failed" folder
			screenshot = takeScreenShot("failed/" + scenario.getName());
			
		} else {
			//take a screenshot and put it under "passed" folder
			screenshot = takeScreenShot("passed/" + scenario.getName());
		}
		
		scenario.attach(screenshot, "img/png", scenario.getName());
		
		EmrahBaseClass.tearDown();
	}

}
