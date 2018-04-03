package com.elabor8.numberconverter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NumberConverterSteps {

    int numberToConvert;
    String result;

    @Given("^the integer (\\d+)$")
    public void setIntegerInput(int numberToConvert) {
        this.numberToConvert = numberToConvert;
    }

    @When("^the converter is run$")
    public void executeConverter() {
        result = NumberConverter.convert(numberToConvert);
    }

    @Then("^the word \"([^\"]*)\" is returned$")
    public void assertResult(String numberAsWords) {
        Assert.assertEquals(numberAsWords, result);
    }

}
