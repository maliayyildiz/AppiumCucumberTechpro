package screens.iosScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AlertViewScreen {
    public AlertViewScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Alert Views\"`]")
    public MobileElement alertViewButton;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Text Entry\"")
    public MobileElement textEntery;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"A Short Title Is Best\"`]")
    public MobileElement popupText;

    @iOSXCUITFindBy(accessibility = "OK")
    public MobileElement okButton;


}
