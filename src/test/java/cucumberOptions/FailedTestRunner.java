package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failedScenarios.txt",glue="StepDefinitions",monochrome=true,
plugin= {"html:target/cucumberHTMLReport.html","json:target/cucumberJsonReport.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		,"rerun:target/failedScenarios.txt"})

public class FailedTestRunner extends AbstractTestNGCucumberTests{
	

	@Override
    @DataProvider(parallel=true)
    public Object[][] scenarios() {
		return super.scenarios();
		
	}
	}


	


