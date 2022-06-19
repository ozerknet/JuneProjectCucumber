package com.juneProject.step_definitions;

import com.juneProject.pages.UserLoginPage;
import com.juneProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userLogin_StepDefinitions {

    UserLoginPage userLoginPage = new UserLoginPage();

    @When("user got Go to login page")
    public void user_got_go_to_login_page() {
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login");
    }
    @Then("username and password entered and click Log in button")
    public void username_and_password_entered_and_click_log_in_button() {
        userLoginPage.userName.sendKeys("Employee83");
        userLoginPage.password.sendKeys("Employee123");
        userLoginPage.submitForm.click();

    }
    @Then("user click to Logout")
    public void user_click_to_logout() {
        userLoginPage.expandMenu.click();
        userLoginPage.logOut.click();

    }

}
