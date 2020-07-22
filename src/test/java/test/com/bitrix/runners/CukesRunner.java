package test.com.bitrix.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt" },
        features = "src/main/resources/features", // we are passing the root path content of feature file
        glue = "test\\com\\bitrix\\step_definitions", // we are passing the source root because it is in the same package so that source root is enough
        dryRun = false,
        tags = "@bitrix24"    //or veya and it is same with or -and logic
        //not@Librarian means run everything except Librarian

)
public class CukesRunner {



}
