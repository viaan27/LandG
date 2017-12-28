package com.CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= "./src/test/resources/features"
,glue= {"com.StepDefination"},
format = {"pretty", "html:target/CucumberReport"} 
)

public class RunnerClass {

}
