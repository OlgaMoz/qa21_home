import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Main {
    @Test(enabled = false)
    public static void main(String[] args) throws InterruptedException {

        //System.out.println("Hello World!");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://mishpahug.co.il/");
        driver.manage().window().maximize();
        driver.get("https://mishpahug.co.il/");
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(6000);
        List<WebElement> filterList = driver.findElements(By.tagName("select"));
        System.out.println("quantity of filters: " + filterList.size());
        for (int i=0; i < filterList.size(); i++){
            System.out.println("filter: "
                    + filterList.get(i).getAttribute("name"));
        }

        System.out.println("List event - " + driver
                .findElement(By.className("titletypesearchevents")).getText());

        System.out.println(" name - selectfood: " + driver
                .findElement(By.name("selectfood")).getTagName());

        driver.findElement(By.linkText("History of Israel.")).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
