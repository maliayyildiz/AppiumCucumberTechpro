package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.androidScreen.ApiDemosScreen;
import screens.androidScreen.MainScreen;
import screens.androidScreen.PreferenceDependenciesScreen;
import screens.androidScreen.PreferenceScreen;
import utils.Driver;

public class ApiDemosSteps {
    MainScreen mainScreen =  new MainScreen();
    ApiDemosScreen apiDemosScreen = new ApiDemosScreen();
    PreferenceScreen preferenceScreen = new PreferenceScreen();
    PreferenceDependenciesScreen preferenceDependenciesScreen = new PreferenceDependenciesScreen();

    @Given("App yuklensin")
    public void app_yuklensin() {
        Driver.getAppiumDriver();
    }

    @And("kullanici ana ekranda")
    public void kullaniciAnaEkranda() {
        Assert.assertTrue(mainScreen.isMainScreenDisplayed());
    }

    @And("kullanici API Demos butununa tikladi")
    public void kullaniciAPIDemosButununaTikladi() {
        mainScreen.apiDemosButton.click();
    }

    @Then("kullanici API Demos ekraninda")
    public void kullaniciAPIDemosEkraninda() {
        Assert.assertTrue(apiDemosScreen.isApiDemosDisplayed());
    }

    @And("kullanici Preference butununa tikladi")
    public void kullaniciPreferenceButununaTikladi() {
        apiDemosScreen.preference.click();
    }

    @Then("kullanici Preference ekraninda")
    public void kullaniciPreferenceEkraninda() {
        Assert.assertTrue(preferenceScreen.isPreferenceScreenDisplayed());
    }

    @And("kullanici Preference dependencies tikladi")
    public void kullaniciPreferenceDependenciesTikladi() {
        preferenceScreen.preferenceDependencies.click();
    }

    @And("kullanici WiFi check box secmis olacak")
    public void kullaniciWiFiCheckBoxSecmisOlacak() {
       if (preferenceDependenciesScreen.checkBox.getAttribute("checked").equals("false")){
           preferenceDependenciesScreen.checkBox.click();
       }
    }

    @And("kullanici WiFi Settings tikladi")
    public void kullaniciWiFiSettingsTikladi() {
        preferenceDependenciesScreen.wifiSettings.click();
    }

    @Then("WiFi setting popup geldi")
    public void wifiSettingPopupGeldi() {
        Assert.assertTrue(preferenceDependenciesScreen.cancelButton.isDisplayed());
    }

    @And("kullanici {string} yazdi")
    public void kullaniciYazdi(String text) {
        preferenceDependenciesScreen.textBox.sendKeys(text);
    }

    @And("kullanci ok butonuna tikladi")
    public void kullanciOkButonunaTikladi() {
        preferenceDependenciesScreen.okButton.click();
    }
}
