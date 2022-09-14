package screens.androidScreenByMetods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import screens.androidScreen.PreferenceDependenciesScreen;
import utils.Driver;

public class PreferanceDepencyScreen extends PreferanceScreen {
    private WebDriver driver= Driver.getAppiumDriver();

    By wifi_text_button= By.xpath("(//android.widget.RelativeLayout[@text=''])[1]");
    By wifi_settings_button= By.xpath("(//android.widget.RelativeLayout[@text=''])[2]");
    By wifi_checkbox_button= By.id("android:id/checkbox");

    public void wifiTextButton_click(){
        driver.findElement(wifi_text_button).click();
    }
    public void wifiSettingsButton_click(){
        driver.findElement(wifi_settings_button).click();
    }

    public void wifiCheckBoxButton_click(String value){
        wait(3);
       String actual= driver.findElement(wifi_text_button).getAttribute("checked");
       if (value.equals("true")&&actual.equals("false")){
           driver.findElement(wifi_text_button).click();
       }else if(value.equals("false")&&actual.equals("true")){
           driver.findElement(wifi_text_button).click();

       }else{
           System.out.println("checkbox statüsü degişmedi");
       }


    }

    public void wait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
