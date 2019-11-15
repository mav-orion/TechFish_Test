package org.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/log.feature",glue={"org/step"},monochrome=true,dryRun=false)
 
public class TestRunner {
 
}
