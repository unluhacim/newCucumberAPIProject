package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt",
        glue = "stepDefinitions",
        dryRun = false,    //false: real run  true:compiling and tell missing steps
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report-rerun.html",
        }
)

public class RerunTestRunner{


}

