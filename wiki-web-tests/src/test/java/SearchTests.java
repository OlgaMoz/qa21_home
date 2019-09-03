import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {


    @Test
    public void searchWikiTestJava() {

        //type java
        type(By.name("search"), "java");
       click(By.name("search"));
      /*   driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");*/

        click(By.name("go"));

        //pause

    }

    @Test
    public void searchWikiTestQA() {

        //type QA
        type(By.name("search"), "QA");
       /* click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("QA");*/

        click(By.name("go"));

        //pause

    }

}
