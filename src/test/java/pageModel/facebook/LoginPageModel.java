package pageModel.facebook;

import generic.WebAction;
import or.facebook.FacebookLandingPage;
import or.facebook.FacebookProfileHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageModel {
    WebAction webAction;
    FacebookLandingPage facebookLandingPage = new FacebookLandingPage();
    FacebookProfileHomePage facebookProfileHomePage = new FacebookProfileHomePage();

    public LoginPageModel(WebDriver driver) {
        webAction = new WebAction(driver);
    }

    /***
     *
     * @param userName
     * @param password
     * Verify that user can login with given credentials. Also verifying that profile page is opened after successful login attempt.
     */
    public void login(String userName, String password) {
        try {
            webAction.type(facebookLandingPage.getLoginUsername(), userName);
            webAction.type(facebookLandingPage.getLoginPassword(), password);
            webAction.click(facebookLandingPage.getLoginBtn());
            webAction.valueEqualTo(facebookProfileHomePage.getProfileHeader(), "Home");
        } catch (Exception ex) {
            Assert.fail("Failed to login!");
        }
    }
}
