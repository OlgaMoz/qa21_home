import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    public void init() {
        driver = new ChromeDriver();
        //waiting default time of element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
        //open site
        openSite("https://en.wikipedia.org");
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void stop() {
        //  Thread.sleep(5000);
        driver.quit();
    }

    public void click(By locator) throws InterruptedException {
        //Thread.sleep(3000);
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) throws InterruptedException {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void clickLoginButton() throws InterruptedException {
        click(By.name("wploginattempt"));
    }

    public void fillLoginForm(String email, String pwd) throws InterruptedException {
        type(By.id("wpName1"), email);
        type(By.id("wpPassword1"), pwd);
    }

    public void initLogin() throws InterruptedException {
        click(By.id("pt-login"));
    }
}
