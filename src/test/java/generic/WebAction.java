package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAction {
    WebDriver driver;

    public WebAction(WebDriver driver) {
        this.driver = driver;
    }

    public void type(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();

    }

    public boolean valueEqualTo(By locator, String value) {
        return driver.findElement(locator).getText().equals(value);
    }

    public Boolean hoverOverElement(By hoverElement) {
        Actions builder = new Actions(driver);
        try {
            builder.moveToElement(driver.findElement(hoverElement)).perform();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public Boolean hoverOverAndClickElement(By clickElement) {
        Actions builder = new Actions(driver);
        try {
            builder.moveToElement(driver.findElement(clickElement)).click().perform();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public Boolean hoverOverAndClickHoldAndReleaseElement(By clickElement) {
        Actions builder = new Actions(driver);
        try {
            builder.moveToElement(driver.findElement(clickElement)).clickAndHold().release().perform();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public Boolean hoverOverAndClickElement(By clickElement, int xOffset, int yOffset) {
        Actions builder = new Actions(driver);
        try {
            builder.moveToElement(driver.findElement(clickElement), xOffset, yOffset).click().perform();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public void waitForElementVisible(By locator, int timeout) {
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public Boolean isElementVisible(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    public Boolean clearText(By locator) {
        try {
            driver.findElement(locator).clear();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
