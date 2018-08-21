package pageModel.walletHub;

import generic.WebAction;
import or.walletHub.WalletHubLoginPage;
import or.walletHub.WallethubCompanyPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WalletHubLoginPageModel {
    WebAction webAction;

    WalletHubLoginPage walletHubLoginPage = new WalletHubLoginPage();
    WallethubCompanyPage wallethubCompanyPage = new WallethubCompanyPage();

    public WalletHubLoginPageModel(WebDriver driver) {
        webAction = new WebAction(driver);
    }

    public WalletHubLoginPageModel login(String userName, String password) {
        try {
            webAction.type(walletHubLoginPage.getLoginUsername(), userName);
            webAction.type(walletHubLoginPage.getLoginPassword(), password);
            webAction.click(walletHubLoginPage.getLoginBtn());
        } catch (Exception ex) {
            Assert.fail("Failed to login");
        }
        return this;
    }
}
