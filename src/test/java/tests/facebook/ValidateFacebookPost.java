package tests.facebook;

import generic.BaseSetup;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageModel.facebook.LoginPageModel;
import pageModel.facebook.ProfilePageModel;

public class ValidateFacebookPost extends BaseSetup {

    @Parameters({"userName", "password"})
    @Test
    public void verifyFacebookPost(String userName, String password) {
        LoginPageModel loginPageModel = new LoginPageModel(driver);
        loginPageModel.login(userName, password);
        ProfilePageModel profilePageModel = new ProfilePageModel(driver);
        profilePageModel.post("Hello World");
    }
}
