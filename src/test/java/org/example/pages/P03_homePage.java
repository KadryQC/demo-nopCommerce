package org.example.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {

    @Given("Click on the dropdown list on the top left of home page and choose euro symbol")
    public WebElement dropDownList() {
        Select select = new Select(driver.findElement(By.id("customerCurrency")));
        select.selectByIndex(1);
        return driver.findElement(By.id("customerCurrency"));
    }
    @Given("^user go to search bar and enter (.*)$")
    public WebElement searchBar(){
WebElement element =new WebDriverWait(Hooks.driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.presenceOfElementLocated(By.id("small-searchterms")));
        return Hooks.driver.findElement(By.id("small-searchterms"));


    }
    @And("click on search button")
    public WebElement searchButton(){
        return  Hooks.driver.findElement(By.className("search-box-button"));
    }

    @Then("Make sure that euro symbol changed in the four products displayed in the homepage")
    public void assertChanged() {

        List<WebElement> symbols = Hooks.driver.findElements(By.className("actual-price"));
        for (int i = 0; i < symbols.size(); i++) {
            WebElement x = symbols.get(i);
           String  euro = x.getText();
           Assert.assertTrue(euro.contains("€"));

        }
    }


    @Then("search should be successful")
    public String searchSuccess(){
        return driver.getCurrentUrl();
    }





}





