package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement GotoLoginPage(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement loginWithValidEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement loginWithValidPass(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginWithInvalidEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement loginWithInValidPass(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButton (){
        return Hooks.driver.findElement(By.cssSelector("div[class='buttons'] button[type='submit']"));
    }
    public String assertUrl(){
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement assertText(){
        return Hooks.driver.findElement(By.linkText("My account"));
    }
    public WebElement assertFailText(){
        return Hooks.driver.findElement(By.className("message-error"));
    }
    public WebElement assertFailColor(){
        return Hooks.driver.findElement(By.className("message-error"));
    }


}
