package com.Runner.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.Baseclass_Login;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature//com", glue = "com//stepdefinition.com")

public class RunnerTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		driver = Baseclass_Login.Browserlaunch("Chrome");

	}
	//System.out.println("Cucumber  hotel booked ");
}
