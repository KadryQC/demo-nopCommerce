package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
public WebElement registerLink(){
    return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
}
public WebElement gender (){
    return Hooks.driver.findElement(By.id("gender-male"));
}
public WebElement enterFname(){
    return Hooks.driver.findElement(By.id("FirstName"));

}
    public WebElement enterLname(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement day (){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        select.selectByIndex(15);

        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement month (){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByIndex(3);

        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement year (){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByIndex(10);

        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement enterEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword (){
        return Hooks.driver.findElement(By.id("Password"));
}
public WebElement confirmPassword(){
    return Hooks.driver.findElement(By.id("ConfirmPassword"));

}
public WebElement registerButton(){
    return  Hooks.driver.findElement(By.id("register-button"));
}
public WebElement successMessage(){
   return   Hooks.driver.findElement(By.className("result"));
}
public WebElement successMessageColor(){
        return   Hooks.driver.findElement(By.className("result"));
    }



}
