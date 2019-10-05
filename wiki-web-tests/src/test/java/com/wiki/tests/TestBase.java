package com.wiki.tests;

import com.wiki.fw.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite(enabled = true)
    public void setUp() {
        app.init();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        app.stop();
    }

}
