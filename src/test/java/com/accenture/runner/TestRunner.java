package com.accenture.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature/"},
		glue = {"com.accenture.steps"},
		tags = "@formulario"
		)
public class TestRunner {
	

}

