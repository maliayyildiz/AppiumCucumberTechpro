package screens.androidScreenByMetods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class ApiDemosScreen extends MainScreen{
    private WebDriver driver= Driver.getAppiumDriver();

    By accessibility_button= By.xpath("//android.widget.TextView[@text='Accessibility']");
    By animation_button= By.xpath("//android.widget.TextView[@text='Animation']");
    By app_button= By.xpath("//android.widget.TextView[@text='App']");
    By content_button= By.xpath("//android.widget.TextView[@text='Content']");
    By graphics_button= By.xpath("//android.widget.TextView[@text='Graphics']");
    By hardware_button= By.xpath("//android.widget.TextView[@text='Hardware']");
    By media_button= By.xpath("//android.widget.TextView[@text='Media']");
    By nfc_button= By.xpath("//android.widget.TextView[@text='NFC']");
    By os_button= By.xpath("//android.widget.TextView[@text='OS']");
    By prefences_button= By.xpath("//android.widget.TextView[@text='Preference']");
    By security_button= By.xpath("//android.widget.TextView[@text='Security']");
    By text_button= By.xpath("//android.widget.TextView[@text='Text']");




    public void accessibilityButon_click(){

        driver.findElement(accessibility_button).click();

    }
    public void animationButon_click(){

        driver.findElement(animation_button).click();

    }
    public void appButon_click(){

        driver.findElement(app_button).click();

    }
    public void contentButon_click(){

        driver.findElement(content_button).click();

    }
    public void graphicsButon_click(){

        driver.findElement(graphics_button).click();
    }

    public void hardwareButon_click(){

        driver.findElement(hardware_button).click();

    }
    public void mediaButon_click(){

        driver.findElement(media_button).click();

    }
    public void nfcButon_click(){

        driver.findElement(nfc_button).click();

    }
    public void osButon_click(){

        driver.findElement(os_button).click();

    }
    public void preferanceButon_click(){

        driver.findElement(prefences_button).click();

    }
    public void securityButon_click(){

        driver.findElement(security_button).click();

    }
    public void textButon_click(){

        driver.findElement(text_button).click();

    }

}
