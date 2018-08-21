package or.facebook;

import org.openqa.selenium.By;

public class FacebookLandingPage {
    public By getLoginUsername() {
        return By.id("email");
    }

    public By getLoginPassword() {
        return By.id("pass");
    }

    public By getLoginBtn() {
        return By.id("loginbutton");
    }
}
