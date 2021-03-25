package com.orangerunnerfile;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "./src/orange.feature",			            //feature location 
		  glue = 	{	"com.stepdef"}, 							//step def code location 
		  plugin = 	{	"pretty", 
				  		"html:target/html report/cucumber-pretty", 
				  		"json:target"},
		  dryRun = false, 											// check the feature files written correctly or not
		  monochrome = true, 										// read the console easily or removed 
		  strict = true, 											//Check all feature steps are correctly corresponding 
		  tags= ("@Smoke") 											//type of test will run
				)


  class RunnerFile  {
	public static void main(String[] args) {
		

	}

}
