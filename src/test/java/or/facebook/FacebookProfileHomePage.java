package or.facebook;

import org.openqa.selenium.By;

public class FacebookProfileHomePage {

    public By getProfileName() {
        return By.id("u_0_3");
    }

    public By getMakePostBtn() {
        return By.xpath("//span[text()='Make Post']");
    }

    public By getPostBlock() {
        // return By.xpath("//div[contains(text(),\"What's on your mind\")]");
        return By.xpath("//div[@contenteditable='true']");
    }

    public By getPostBtn() {
        return By.xpath("//button/span[text()='Post' or text()='Share']");
    }

    public By getRecentPost(String post) {
        return By.xpath("//div/p[text()='" + post + "']");
    }

    public By getProfileHeader() {
        return By.id("u_0_c");
    }

}
