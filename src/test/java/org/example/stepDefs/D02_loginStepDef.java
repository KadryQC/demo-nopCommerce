package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void userGotoLoginPage(){
        login.GotoLoginPage().click();
    }
    @When("user login with \"valid\" \"test22@test.com\" and \"P@ssw0rd\"")
    public void userEnterValidData(){
        login.loginWithValidEmail().sendKeys("test25@test.com");
        login.loginWithValidPass().sendKeys("P@ssw0rd");
    }
    @When("user login with \"invalid\" \"wrong@test.com\" and \"P@ssw0rrrd\"")
    public void userEnterInvalidData(){
        login.loginWithInvalidEmail().sendKeys("wrong@test.com");
        login.loginWithInValidPass().sendKeys("P@ssw0rrrd");
    }

    @And("user press on login button")
    public void userClickOnLoginButton(){
        login.loginButton().click();
    }
    @Then("user login to the system successfully")
    public void successAssertion(){
        softAssert.assertEquals("https://demo.nopcommerce.com/",login.assertUrl());
        softAssert.assertTrue(login.assertText().isDisplayed());
        softAssert.assertAll();

    }
    @Then("user could not login to the system")
    public void failureAssertion(){
        softAssert.assertTrue(login.assertFailText().getText().contains("Login was unsuccessful"));
        softAssert.assertEquals(login.assertFailColor().getCssValue("color"),"rgba(228, 67, 75, 1)");
        softAssert.assertAll();
    }


}
