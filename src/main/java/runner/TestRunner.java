package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Selenium\\workspace\\CucumberBDD\\src\\main\\java\\features",glue={"stepDefinations"}}
)
public class TestRunner {

}
