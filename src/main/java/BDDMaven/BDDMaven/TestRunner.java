package BDDMaven.BDDMaven;

import org.testng.annotations.BeforeClass;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(
        format={"pretty","json:path/to/json_repot.json"},
        features = "src/test/resource/feature/google.feature"
//        glue="com.sri.stepDefinition"
//        tags={"@smoke,@regression"}
        )

public class TestRunner extends AbstractTestNGCucumberTests{
	@BeforeClass()
	public void instentiateDriver(){
		
	}
}
