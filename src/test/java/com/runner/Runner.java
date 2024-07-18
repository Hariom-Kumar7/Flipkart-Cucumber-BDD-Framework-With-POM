package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = {"C:\\Users\\kumar\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\Alphbin_Project_Flipkart\\src\\test\\resources\\Flipkart\\flipkart.feature"},
	glue = ("com.stepdefinition")  //inside bracket Packege Name
 )

public class Runner extends AbstractTestNGCucumberTests {

}
