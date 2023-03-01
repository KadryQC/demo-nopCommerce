package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage p03HomePage= new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
    @Given("^user go to search bar and enter (.*)$")
    public void enterDataInSearchBar(String data){
    p03HomePage.searchBar().sendKeys(data);
}
    @And("click on search button")
    public void clickOnSearchButton(){
    p03HomePage.searchButton().click();
}
    @Then("search should be successful")
    public void searchAssertion(){
    softAssert.assertTrue(p03HomePage.searchSuccess().contains("https://demo.nopcommerce.com/search?q="));
    p03HomePage.assertCountSearchByName();
    p03HomePage.assertCountSearchBySku();
        System.out.println("found");


    softAssert.assertAll();

}

}
