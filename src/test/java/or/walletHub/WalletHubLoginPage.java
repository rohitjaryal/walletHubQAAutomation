package or.walletHub;

import org.openqa.selenium.By;

public class WalletHubLoginPage {
    public By getLoginUsername() {
        return By.name("em");
    }

    public By getLoginPassword() {
        return By.name("pw");
    }

    public By getLoginBtn() {
        return By.xpath("//button/span[text()='Login']");
    }
}
