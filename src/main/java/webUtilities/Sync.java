package webUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Sync extends TestCaseHelper {

    public boolean isElementDisplayed(By path, int waitTime) {
        nullifyImplicitWait();
        boolean bFlag = false;

        Wait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));

        WebElement ele = driver.findElement(path);
        bFlag = ele.isDisplayed();

        return bFlag;
    }

    public boolean isElementPresent(By path, int waitTime) {
        nullifyImplicitWait();
        boolean bFlag = false;

        Wait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.presenceOfElementLocated(path));

        WebElement ele = driver.findElement(path);
        int iSize = driver.findElements(path).size();
        if (iSize > 0)
            bFlag = true;
        else
            bFlag = false;

        return bFlag;
    }

    public boolean isEnabled(By path, int waitTime) {
        boolean bElementDisplayFlag = isElementDisplayed(path, waitTime);
        boolean bEnableFlag = false;
        WebElement ele = null;
        if (bElementDisplayFlag) {
            ele = driver.findElement(path);
            bEnableFlag = ele.isDisplayed();
        }
        return bEnableFlag;
    }

    public WebElement getWebElement(By path, int waitTime) {
        WebElement ele = null;
        if (isElementPresent(path, waitTime)) {
            ele = driver.findElement(path);
        }
        return ele;
    }

    private void nullifyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }


}
