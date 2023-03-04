package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.List;
import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverStepDef {

    P03_homePage homePage2 = new P03_homePage();

    @Given("Move by the mouse on computer category")
    public void hoverOnComputer(){
     Actions actions = new Actions(driver);
     homePage2.hoverMainCategory();
     actions.moveToElement(homePage2.hoverMainCategory()).perform();

    }
    @And("select Sub-category")
            public void selectSubCategory(){
        homePage2.selectFromSubCategory().click();
    }
    @Then("Make sure that the sub-category title is contains the one you get it")
    public void wordAssertion(){
        Assert.assertTrue(homePage2.makeWordAssertion().getText().toLowerCase().contains("notebooks"));
        System.out.println("success");


    }


}
