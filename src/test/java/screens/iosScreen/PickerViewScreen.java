package screens.iosScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class PickerViewScreen {
    public PickerViewScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @iOSXCUITFindBy(accessibility = "Red color component value")
    public MobileElement firstColumn;

    @iOSXCUITFindBy(accessibility = "Green color component value")
    public MobileElement secondColumn;

    @iOSXCUITFindBy(accessibility = "Blue color component value")
    public MobileElement thirdColumn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Picker View\"]")
    public MobileElement pickerViewTitle;

}
