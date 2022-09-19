package screens.iosScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SwitchesiOSScreen {
    public SwitchesiOSScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[1]")
    public MobileElement firstSwitch;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSwitch)[2]")
    public MobileElement secondSwitch;

}
