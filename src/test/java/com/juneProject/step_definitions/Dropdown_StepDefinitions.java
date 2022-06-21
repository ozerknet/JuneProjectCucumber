package com.juneProject.step_definitions;

import com.juneProject.pages.DropdownPage;
import com.juneProject.utilities.BrowserUtils;
import com.juneProject.utilities.ConfigurationReader;
import com.juneProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown_StepDefinitions {

    DropdownPage dropdownPage = new DropdownPage();

    @When("user go to link")
    public void user_go_to_link() {
        String url = ConfigurationReader.getProperty("dropdown.url");
        Driver.getDriver().get(url);

    }
    @Then("check options data is available")
    public void check_option_data_is_avaible(List<String> expectedMenu) {
        List<String> actualMenu = BrowserUtils.dropdownOptionsAsString(dropdownPage.selectMenu);

        System.out.println("actualMenu = " + actualMenu);

        Assert.assertEquals(expectedMenu, actualMenu);

    }

}
