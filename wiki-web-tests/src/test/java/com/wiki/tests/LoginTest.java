package com.wiki.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void preConditions(){
        if(!app.getSession().isElementPresent(By.id("pt-login"))){
            app.getSession().openSite("https://en.wikipedia.org");
        }
    }

    @Test
    public void loginTest() throws InterruptedException {
        //init login
        app.getSession().initLogin();
        //fill login form
        app.getSession().fillLoginForm("qwer@poiuy.com", "qwer@poiuy.com");
        //click login button
        app.getSession().clickLoginButton();
    }

    @AfterMethod
    public void postActions(){
        app.getSession().openSite("https://en.wikipedia.org");
    }

}
