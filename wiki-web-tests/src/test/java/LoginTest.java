import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        //init login
        app.initLogin();
        //fill login form
        app.fillLoginForm("qwer@poiuy.com", "qwer@poiuy.com");
        //click login button
        app.clickLoginButton();


    }


}
