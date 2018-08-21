package tests.walletHub;

import generic.BaseSetup;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageModel.walletHub.WalletHubCompangePageModel;
import pageModel.walletHub.WalletHubReviewPageModel;

public class ValidateReview extends BaseSetup {

    /***
     * Verify that user can add a review with 5 star ratings.
     * @param userName
     * @param password
     * @param review
     */
    @Parameters({"userName", "password", "review"})
    @Test
    public void validateReview(String userName, String password, String review) {
        WalletHubCompangePageModel walletHubCompangePageModel = new WalletHubCompangePageModel(driver);
        walletHubCompangePageModel.login(userName, password);
        WalletHubReviewPageModel walletHubReviewPageModel = new WalletHubReviewPageModel(driver);
        walletHubReviewPageModel.postAndVerifyReview(review);
    }
}
