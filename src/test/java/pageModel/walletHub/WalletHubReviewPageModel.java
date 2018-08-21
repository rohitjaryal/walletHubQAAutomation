package pageModel.walletHub;

import generic.WebAction;
import or.walletHub.WalletHubCompanyReviewPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WalletHubReviewPageModel {
    WebAction webAction;

    WalletHubCompanyReviewPage walletHubCompanyReviewPage = new WalletHubCompanyReviewPage();

    public WalletHubReviewPageModel(WebDriver driver) {
        webAction = new WebAction(driver);
    }

    public WalletHubReviewPageModel clickOnWriteReviewBtn() {
        webAction.click(walletHubCompanyReviewPage.getWriteReviewBtn());
        return this;
    }

    public WalletHubReviewPageModel selectPolicy(String policy) {
        webAction.click(walletHubCompanyReviewPage.getPolicyOptions());
        webAction.click(walletHubCompanyReviewPage.getPolicy(policy));
        return this;
    }

    private WalletHubReviewPageModel hoverOverRating(String rating) {
        webAction.hoverOverElement(walletHubCompanyReviewPage.getReviewRating(rating));
        try {
            // User for demonstration purpose only
            Thread.sleep(1000);
        } catch (Exception ex) {

        }
        return this;
    }

    private WalletHubReviewPageModel hoverAndClickMaxRating(String rating) {
        webAction.hoverOverAndClickElement(walletHubCompanyReviewPage.getReviewRating(rating));
        try {
            // User for demonstration purpose only
            Thread.sleep(1000);
        } catch (Exception ex) {

        }
        return this;
    }

    public WalletHubReviewPageModel selectRatings() {
        hoverOverRating("1").hoverOverRating("2").hoverOverRating("3").hoverOverRating("4").hoverAndClickMaxRating("5");
        return this;
    }

    public WalletHubReviewPageModel writeReview(String message) {
        webAction.clearText(walletHubCompanyReviewPage.getReviewContent());
        webAction.type(walletHubCompanyReviewPage.getReviewContent(), message);
        return this;
    }

    public WalletHubReviewPageModel submitReview() {
        webAction.click(walletHubCompanyReviewPage.getSubmitBtn());
        return this;
    }

    public WalletHubReviewPageModel checkRecentReview(String review) {
        webAction.isElementVisible(walletHubCompanyReviewPage.getReviewText(review));
        return this;
    }

    public WalletHubReviewPageModel postAndVerifyReview(String review) {
        try {
            clickOnWriteReviewBtn().selectPolicy("Health").selectRatings().writeReview(review).submitReview().checkRecentReview(review);
        } catch (Exception ex) {
            Assert.fail("Failed to post| verify review!");
        }
        return this;
    }

}
