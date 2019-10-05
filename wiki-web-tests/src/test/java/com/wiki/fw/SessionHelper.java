package com.wiki.fw;

import com.wiki.fw.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() throws InterruptedException {
        click(By.name("wploginattempt"));
    }

    public void fillLoginForm(String email, String pwd) {
        waitForElementAndType(By.id("wpName1"), 15,  email);
        //type(By.id("wpName1"), email);
        type(By.id("wpPassword1"), pwd);
    }

    public void initLogin() throws InterruptedException {
        waitForElementAndClick( By.id("pt-login"),20);
        click(By.id("pt-login"));
    }

    public void openSite(String url) {
        driver.get(url);
    }

}
