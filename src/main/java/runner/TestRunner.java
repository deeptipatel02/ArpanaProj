package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "G:\\sel\\Sel@9AM(EST)\\workspace\\CucumberBDD_FW\\src\\main\\java\\features"
		,glue={"stepDefinations"}
		,monochrome = true
		,dryRun = false
		,plugin= {"pretty","json:target/myReports.report.json","junit:target/myReports.report.xml"}
		
		
		)
public class TestRunner {

}
