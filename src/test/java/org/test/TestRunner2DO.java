package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\login2.feature",monochrome=true,snippets=SnippetType.CAMELCASE,glue="org.fun")

public class TestRunner2DO {

}
