package utils;


import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ReusableMethods {

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void tapOn(MobileElement element) {
        waitToBeClickable(element,10);
        element.click();
    }

    public static void enterText(MobileElement element,String text){
        waitToBeClickable(element,10);
        element.sendKeys(text);
    }

    public static void enterText(MobileElement element,String text, boolean needClear){
        waitToBeClickable(element,10);
        if (needClear) { element.clear(); }
        element.sendKeys(text);
    }

    public static boolean isElementPresent(MobileElement mobileElement) {
        boolean elementFound = false;
        waitToBeVisible(mobileElement,10);
        if (mobileElement.isDisplayed()) {
            elementFound = true;
        }
        return elementFound;
    }

    public static void waitToBeVisible(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitToBeClickable(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollDownToBeVisible(MobileElement element){

    }

    public static void scrollUpToBeVisible(MobileElement element){

    }

    public static void swipeFromElementToElement(MobileElement el1, MobileElement el2) {

    }


}
