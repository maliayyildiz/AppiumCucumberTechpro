package screens.androidScreenByMetods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class PreferanceScreen extends ApiDemosScreen{
    private WebDriver driver= Driver.getAppiumDriver();

    By preferance_from_xml_button= By.xpath("//android.widget.TextView[@text='1. Preferences from XML']");
    By launching_preference_button= By.xpath("//android.widget.TextView[@text='2. Launching preferences']");
    By preferance_depency_button= By.xpath("//android.widget.TextView[@text='3. Preference dependencies']");
    By default_values_button= By.xpath("//android.widget.TextView[@text='4. Default values']");
    By preferances_fromCode_button= By.xpath("//android.widget.TextView[@text='5. Preferences from code']");
    By advanges_preferances_button= By.xpath("//android.widget.TextView[@text='6. Advanced preferences']");
    By fragment_button= By.xpath("//android.widget.TextView[@text='7. Fragment']");
    By headers_button= By.xpath("//android.widget.TextView[@text='8. Headers']");
    By switch_button= By.xpath("//android.widget.TextView[@text='9. Switch']");


    public void preferanceFromXmlButton_click(){
        driver.findElement(preferance_from_xml_button).click();
    }
    public void lauchingPreferanceButton_click(){
        driver.findElement(launching_preference_button).click();
    }
    public void preferanceDepencyButton_click(){
        driver.findElement(preferance_depency_button).click();
    }
    public void defaultValuesButton_click(){
        driver.findElement(default_values_button).click();
    }
    public void preferanceFromCodeButton_click(){
        driver.findElement(preferances_fromCode_button).click();
    }
    public void advangesPreferanceButton_click(){
        driver.findElement(advanges_preferances_button).click();
    }
    public void fragmentButton_click(){
        driver.findElement(fragment_button).click();
    }
    public void headersButton_click(){
        driver.findElement(headers_button).click();
    }
    public void switchButton_click(){
        driver.findElement(switch_button).click();
    }


}
