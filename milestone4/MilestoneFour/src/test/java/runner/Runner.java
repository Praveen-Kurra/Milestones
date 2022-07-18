package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="resources/feature"  ,glue = "stepDefnition",
            plugin = "html:reports/1.html")
public class Runner {

}
