package aaarunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/main/resources/features",
		glue = {"hooks","aaapagefactory","aaasteps"},
		tags = "@alltestrun",
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports"}
		
)


public class noprunnerTest 
{
	

	}
	

