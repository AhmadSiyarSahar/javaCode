package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features="C:\\Users\\Ahmad Siyar Sahar\\eclipse-workspace\\NextHealthProject\\Features\\FacebookLogin.feature", 
glue="StepDefinations")


public class FacebookRunner {

}
