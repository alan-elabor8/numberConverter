package com.elabor8.numberconverter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/numberconverter.json",
                "html:target/cucumber/numberconverter.html",
                "pretty"
        },
        tags = {"~@ignored"},
        features = {"src/test/resources"}
)
public class RunNumberConverterTest {
}
