import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() {
        //init login
        initLogin();
        //fill login form
        fillLoginForm("qwer@poiuy.com", "qwer@poiuy.com");
        //click login button
        clickLoginButton();


    }


}
