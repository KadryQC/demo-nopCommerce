package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage3 = new P03_homePage();
    @Given("user opens facebook")
    public void facebookLink(){
        homePage3.selectFacebook().click();
    }
    @Given("user opens twitter")
    public void twitterLink(){
        homePage3.selectTwitter().click();
    }
    @Given("user opens youtube")
    public void youtubeLink(){
        homePage3.selectYoutube().click();
    }

    @Then("facebook page is opened in new tab and assert on it")
    public void facebookTab() throws Exception{
        WebDriverWait wait = new WebDriverWait(homePage3.dri(), Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        ArrayList<String> tabs =new ArrayList<>(homePage3.dri().getWindowHandles());
        System.out.println(tabs.size());
        //Thread.sleep(Duration.ofSeconds(3));
        homePage3.dri().switchTo().window(tabs.get(2));
        Assert.assertEquals("https://www.facebook.com/nopCommerce",homePage3.dri().getCurrentUrl());
        System.out.println("Assertion success");
        System.out.println("Tab1:  "+homePage3.dri().getCurrentUrl());
        homePage3.dri().close();
        homePage3.dri().switchTo().window(tabs.get(1));
        System.out.println("Tab2:  "+homePage3.dri().getCurrentUrl());

    }
    @Then("twitter page is opened in new tab and assert on it")
    public void twitterTab() throws Exception{
        WebDriverWait wait = new WebDriverWait(homePage3.dri(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        ArrayList<String> tabs =new ArrayList<>(homePage3.dri().getWindowHandles());
        System.out.println(tabs.size());
       // Thread.sleep(Duration.ofSeconds(5));
        homePage3.dri().switchTo().window(tabs.get(2));
        Assert.assertEquals("https://twitter.com/nopCommerce",homePage3.dri().getCurrentUrl());
        System.out.println("Tab1:  "+homePage3.dri().getCurrentUrl());
        System.out.println("Assertion success");
        homePage3.dri().close();
        homePage3.dri().switchTo().window(tabs.get(1));
        System.out.println("Tab2:  "+homePage3.dri().getCurrentUrl());

    }
    @Then("youtube page is opened in new tab and assert on it")
    public void youtubeTab() throws Exception{
        WebDriverWait wait = new WebDriverWait(homePage3.dri(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        ArrayList<String> tabs =new ArrayList<>(homePage3.dri().getWindowHandles());
        System.out.println(tabs.size());
        //Thread.sleep(Duration.ofSeconds(5));
        homePage3.dri().switchTo().window(tabs.get(2));
        Assert.assertEquals("https://www.youtube.com/user/nopCommerce",homePage3.dri().getCurrentUrl());
        System.out.println("Assertion success");
        System.out.println("Tab1:  "+homePage3.dri().getCurrentUrl());
        homePage3.dri().close();
        homePage3.dri().switchTo().window(tabs.get(1));
        System.out.println("Tab2:  "+homePage3.dri().getCurrentUrl());

    }




}
