package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage1= new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
    @Given("^user go to search bar and enter (.*)$")
    public void enterDataInSearchBar(String data){
    homePage1.searchBar().sendKeys(data);
}
    @And("click on search button")
    public void clickOnSearchButton(){
    homePage1.searchButton().click();
}
    @Then("search should be successful")
    public void searchAssertion(){
    softAssert.assertTrue(homePage1.searchSuccess().contains("https://demo.nopcommerce.com/search?q="));
    homePage1.assertCountSearchByName();
    homePage1.assertCountSearchBySku();
        System.out.println("found");


    softAssert.assertAll();

}

}
