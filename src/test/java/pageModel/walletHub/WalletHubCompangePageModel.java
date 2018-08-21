package pageModel.walletHub;

import generic.WebAction;
import or.walletHub.WalletHubLoginPage;
import or.walletHub.WallethubCompanyPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WalletHubCompangePageModel {
    WebAction webAction;

    WalletHubLoginPage walletHubLoginPage = new WalletHubLoginPage();
    WallethubCompanyPage wallethubCompanyPage = new WallethubCompanyPage();
    WalletHubLoginPageModel walletHubLoginPageModel;

    public WalletHubCompangePageModel(WebDriver driver) {
        webAction = new WebAction(driver);
        walletHubLoginPageModel = new WalletHubLoginPageModel(driver);
    }


    public WalletHubLoginPageModel clickOnLoginBtn() {
        try {
            webAction.click(wallethubCompanyPage.getLoginBtn());
        } catch (Exception ex) {
            Assert.fail("Failed to login.");
        }
        return walletHubLoginPageModel;
    }

    public WalletHubLoginPageModel login(String userName, String password) {
        try {
            webAction.click(wallethubCompanyPage.getLoginBtn());
            walletHubLoginPageModel.login(userName, password);
        } catch (Exception ex) {
            Assert.fail("Failed to login.");
        }
        return walletHubLoginPageModel;
    }

}
