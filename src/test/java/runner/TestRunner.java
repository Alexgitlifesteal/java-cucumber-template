package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        glue = "stepdefs",
        features = "src/test/resources/features/bbcnews.feature"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
