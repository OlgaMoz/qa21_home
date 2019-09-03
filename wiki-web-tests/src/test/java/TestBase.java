import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        //waiting of default element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open site
        openSite("https://en.wikipedia.org");
    }

    public void openSite(String url) {
        driver.get(url);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void clickLoginButton() {
        click(By.name("wploginattempt"));
    }

    public void fillLoginForm(String email, String pwd) {
        type(By.id("wpName1"), email);
        type(By.id("wpPassword1"), pwd);
    }

    public void initLogin() {
        click(By.id("pt-login"));
    }
}
