package com.juneProject.step_definitions;

import com.juneProject.pages.GoogleSearchPage;
import com.juneProject.utilities.ConfigurationReader;
import com.juneProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleSearch_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        String url = ConfigurationReader.getProperty("google.url");
        Driver.getDriver().get(url);
        googleSearchPage.IAggreeButton.click();

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));

    }
}
