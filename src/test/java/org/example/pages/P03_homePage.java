package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.swing.*;
import java.util.List;



public class P03_homePage {


    public WebElement dropDownList() {
        Select select = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        select.selectByIndex(1);
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public void assertChanged() {

        List<WebElement> symbols = Hooks.driver.findElements(By.className("actual-price"));
        for (int i = 0; i < symbols.size(); i++) {
            WebElement x = symbols.get(i);
            String euro = x.getText();
            Assert.assertTrue(euro.contains("€"));

        }
    }


    public WebElement searchBar() {
        return Hooks.driver.findElement(By.id("small-searchterms"));

    }

    public WebElement searchButton() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }


    public String searchSuccess() {
        return Hooks.driver.getCurrentUrl();
    }

    public  List<WebElement> assertCountSearchByName() {
        List<WebElement> items = Hooks.driver.findElements(By.className("product-item"));
        int num = items.size();
        for (int j=0 ; j<num;j++){
            WebElement z = items.get(j);
            String itemWord = z.getText();
            System.out.println(itemWord);

        }
        return Hooks.driver.findElements(By.className("product-item"));

    }
    public List<WebElement> assertCountSearchBySku() {
        List<WebElement> items = Hooks.driver.findElements(By.className("product-title"));

        int num = items.size();
        for (int s=0 ; s<num;s++){
            WebElement v = items.get(s);
            String skuItemWord = v.getText();
            System.out.println(skuItemWord);


        }
        return Hooks.driver.findElements(By.className("product-title"));

    }
    public WebElement hoverMainCategory(){

         return Hooks.driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/computers']"));
    }
    public WebElement selectFromSubCategory(){
        return Hooks.driver.findElement(By.linkText("Notebooks"));
    }
    public WebElement makeWordAssertion(){
        return Hooks.driver.findElement(By.cssSelector("div[class='page-title'] h1"));
    }

    public WebElement selectFacebook(){
        return Hooks.driver.findElement(By.cssSelector("a[href='http://www.facebook.com/nopCommerce']"));
    }
    public WebElement selectTwitter(){
        return Hooks.driver.findElement(By.cssSelector("a[href='https://twitter.com/nopCommerce']"));
    }
    public WebElement selectYoutube(){
        return Hooks.driver.findElement(By.cssSelector("a[href='http://www.youtube.com/user/nopCommerce']"));
    }

    public WebDriver dri(){
        return Hooks.driver ;
}



}







