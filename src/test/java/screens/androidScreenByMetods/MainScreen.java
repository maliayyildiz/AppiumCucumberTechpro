package screens.androidScreenByMetods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class MainScreen {
    private WebDriver driver= Driver.getAppiumDriver();


    By app_invite_demo_button=By.xpath("//android.widget.TextView[@text='App Invite Demo']");
    By api_demos_button=By.xpath("//android.widget.TextView[@text='API Demos']");
    By support_v4_button=By.xpath("//android.widget.TextView[@text='Support v4 Demos']");
    By support_v7_button=By.xpath("//android.widget.TextView[@text='Support v7 Demos']");
    By support_v13_button=By.xpath("//android.widget.TextView[@text='Support v13 Demos']");
    By support_design_demos_button=By.xpath("//android.widget.TextView[@text='Support Design Demos']");
    By support_percent_demos_button=By.xpath("//android.widget.TextView[@text='Support Percent Demos']");
    By support_app_navigation_button=By.xpath("//android.widget.TextView[@text='Support App Navigation']");
    By support_design_demo_cheesesquare_button=By.xpath("//android.widget.TextView[@text='Support Design Demo: Cheesesquare']");
    By support_mobile_vision_button=By.xpath("//android.widget.TextView[@text='Mobile Vision Demos']");
    By support_leanback_showcase_button=By.xpath("//android.widget.TextView[@text='Support Leanback Showcase (Android TV)']");
    By arama_buttonu=By.xpath("//android.widget.TextView[@content-desc=\"Search\"]");


    public void enterAppInviyeDemo_click(){
        driver.findElement(app_invite_demo_button).click();

    }

    public void apiDemosButton_click(){
        driver.findElement(api_demos_button).click();
    }
    public void supportV4Button_click(){
        driver.findElement(support_v4_button).click();
    }
    public void supportV7Button_click(){
        driver.findElement(support_v7_button).click();
    }
    public void supportV13Button_click(){
        driver.findElement(support_v13_button).click();
    }
    public void supportDesignDemosButton_click(){
        driver.findElement(support_design_demos_button).click();
    }
    public void percentDemosButton_click(){
        driver.findElement(support_percent_demos_button).click();
    }
    public void supportAppNavigationButton_click(){
        driver.findElement(support_app_navigation_button).click();
    }
    public void designDemoChessesButton_click(){
        driver.findElement(support_design_demo_cheesesquare_button).click();
    }
    public void supportMobileVisionButton_click(){
        driver.findElement(support_mobile_vision_button).click();
    }
    public void supportleanbckButton_click(){
        driver.findElement(support_leanback_showcase_button).click();
    }
    public void aramaButonu_click(String aranan_ifade){
        driver.findElement(arama_buttonu).sendKeys(aranan_ifade);
    }




}
