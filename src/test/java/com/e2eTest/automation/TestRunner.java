package com.e2eTest.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/spec/features"}, //the features cucumber path 
glue= {}, // the according code java
plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber.json"}, // generate report with this name 
tags= {"@tag"}, 
snippets=SnippetType.CAMELCASE, 
monochrome=true) // console lisible : elimine les caracteres non lisible
public class TestRunner {




}
