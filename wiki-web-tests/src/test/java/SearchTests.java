import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {


    @Test(priority = 2)
    public void searchWikiTestJava() throws InterruptedException {

        //type java
       app.type(By.name("search"), "java");
       app.click(By.name("search"));

       app.click(By.name("go"));
      //  Assert.assertEquals(app.);
    }

    @Test(priority = 1)
    public void searchWikiTestQA() throws InterruptedException {

        //type QA
        app.type(By.name("search"), "QA");
        app.click(By.name("go"));

        //pause

    }

}
