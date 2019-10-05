package com.wiki.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    ArticleHelper article;
    SessionHelper session;

    public void init() {
        driver = new ChromeDriver();
        //waiting default time of element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
        //open site
        session = new SessionHelper(driver);
        driver.get("https://en.wikipedia.org");
        article = new ArticleHelper(driver);
    }

    public void stop() {
        //  Thread.sleep(5000);
        driver.quit();
    }

    public ArticleHelper getArticle() {
        return article;
    }

    public SessionHelper getSession() {
        return session;
    }

}
