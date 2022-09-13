package screens.androidScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ApiDemosScreen {
    public ApiDemosScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public MobileElement apiDemosTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement preference;

    public boolean isApiDemosDisplayed() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return apiDemosTitle.isDisplayed();
    }
}
