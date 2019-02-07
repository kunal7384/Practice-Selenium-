package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Selenium practice code\\Guru99BankProjectUsingCucumber\\src\\test\\resources\\bank.feature",
glue="stepdefination",plugin= {"pretty" ,"html:C:\\Users\\dkunal\\Desktop\\Report\\cucumber\\abc"},
monochrome=true)
public class TestRunner {

}
