package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register p01Register = new P01_register();
    SoftAssert softAssert = new SoftAssert();
    @Given("user go to register page")
    public void goRegisterPage() {
     p01Register.registerLink().click();
    }
    @When("select gender type")
    public void gender(){
        p01Register.gender().click();

    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void enterFNameAndLName(){
        p01Register.enterFname().sendKeys("automation");
        p01Register.enterLname().sendKeys("tester");
    }
    @And("user enter date of birth")
    public void enterBirthDate(){
        p01Register.day();
        p01Register.month();
        p01Register.year();
    }
    @And("user enter email field")
    public void enterValidEmail(){
        p01Register.enterEmail().sendKeys("test15@test.com");
    }
    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void userEnterPassword(){
        p01Register.enterPassword().sendKeys("P@ssw0rd");
        p01Register.confirmPassword().sendKeys("P@ssw0rd");

    }
    @And("user clicks on register button")
    public void userClickOnRegister(){
        p01Register.registerButton().click();
    }
    @Then("success message is displayed")
    public void successMessage (){
        softAssert.assertTrue(p01Register.successMessage().isDisplayed());
        softAssert.assertEquals(p01Register.successMessageColor().getCssValue("color"), "rgba(76, 177, 124, 1)");
        softAssert.assertAll();

    }



}
