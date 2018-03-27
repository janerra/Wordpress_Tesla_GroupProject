package com.app.runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty",
				"html:target/cucumber-report"
		},
		
		tags = "@test",
		features = "src/test/resources/com/app/features/", 
		glue = "com/app/step_definitions",
		dryRun=false
)

public class CukesRunner {

}
