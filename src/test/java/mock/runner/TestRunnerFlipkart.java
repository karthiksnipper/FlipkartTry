package mock.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import mock.report.ReportCucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
			                  glue={"mock.stepdefinition"},
			                  tags= "",
			                  plugin= { "pretty", "json:target/CucumberReports/CucumberReport.json"},
			                  dryRun=false
		                        )
public class TestRunnerFlipkart extends ReportCucumber{
	
//	@AfterClass
//	public static void afterClass() throws FileNotFoundException, IOException {
//		ReportCucumber.generateJVMReport(getProjectPath()+getPropertyFileValue("jsonPath"));
//	}

}
