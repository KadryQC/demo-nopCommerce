package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;


public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    @Given("Click on the dropdown list on the top left of home page and choose euro symbol")
    public void userClickOnDropDownList(){
        homePage.dropDownList();

    }
    @Then("Make sure that euro symbol changed in the four products displayed in the homepage")
    public void assertSymbol(){
     homePage.assertChanged();
    }

}
