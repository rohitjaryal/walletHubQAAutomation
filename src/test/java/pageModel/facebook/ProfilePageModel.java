package pageModel.facebook;

import generic.WebAction;
import or.facebook.FacebookProfileHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProfilePageModel {
    WebAction webAction;
    FacebookProfileHomePage facebookProfileHomePage = new FacebookProfileHomePage();

    public ProfilePageModel(WebDriver driver) {
        webAction = new WebAction(driver);
    }


    /***
     *
     * @param message - POST
     * Post the message on wall and verify that it appears in recent post.
     */
    public void post(String message) {
        try {
            webAction.click(facebookProfileHomePage.getMakePostBtn());
            webAction.type(facebookProfileHomePage.getPostBlock(), message);
            webAction.click(facebookProfileHomePage.getPostBtn());
            webAction.valueEqualTo(facebookProfileHomePage.getRecentPost(message), message);
        } catch (Exception ex) {
            Assert.fail("Could not post on Facebook.");
        }

    }

}
