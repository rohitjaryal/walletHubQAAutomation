package or.walletHub;

import org.openqa.selenium.By;

public class WalletHubCompanyReviewPage {

    public By getPolicyOptions() {
        return By.xpath("//span[text()='Please select your policy']");
    }

    public By getPolicy(String policy) {
        return By.linkText(policy);
    }

    public By getWriteReviewBtn() {
        return By.xpath("//span[text()='Write a Review']");
    }

    public By getReviewRating(String id) {
        return By.xpath("//span[text()='" + id + "']/parent::a");
    }

    public By getReviewContent() {
        return By.id("review-content");
    }

    public By getSubmitBtn() {
        return By.xpath("//div[@class='submit']/input");
    }

    public By getReviewText(String review) {
        return By.xpath("//p[text()='" + review + "']");
    }
}
