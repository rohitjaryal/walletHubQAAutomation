package or.walletHub;

import org.openqa.selenium.By;

public class WallethubCompanyPage {

    public By getLoginBtn() {
        return By.xpath("//nav[@class='right-menu loggedOut']/a[text()='Login']");
    }

    public By getWriteReviewbtn() {
        return By.xpath("//span[text()='Write a Review']");
    }

}
