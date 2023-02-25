package org.example.stepDefs;

import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage p03HomePage= new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
public void enterDataInSearchBar(String data){
    p03HomePage.searchBar().sendKeys(data);
}
public void clickOnSearchButton(){
    p03HomePage.searchButton().click();
}
public void searchAssertion(){
    softAssert.assertTrue(p03HomePage.searchSuccess().contains("https://demo.nopcommerce.com/search?q="));

    softAssert.assertAll();

}

}
