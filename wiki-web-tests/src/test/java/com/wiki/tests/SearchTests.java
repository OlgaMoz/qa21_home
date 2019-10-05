package com.wiki.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {


    @Test(priority = 2)
    public void searchWikiTestJava() throws InterruptedException {

        //type java
       app.getArticle().typeRequest("java");
       app.getArticle().clickGoButton();

       Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(),
               "java".toLowerCase());
    }

    @Test(priority = 1)
    public void searchWikiTestQA() throws InterruptedException {

        //type QA
        app.getArticle().typeRequest("QA");
        app.getArticle().clickGoButton();

        Assert.assertEquals(app.getArticle().getArticleTitle().toLowerCase(),
                "QA".toLowerCase());
    }

}
