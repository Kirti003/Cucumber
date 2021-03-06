package com.disney.cucumber.cucumberMaven;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( 
  plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport"},
  features = {"src/test/Features/tag1,tag2"}
  )

public class RunnerTest {

}
