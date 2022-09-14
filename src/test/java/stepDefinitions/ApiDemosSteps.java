package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class ApiDemosSteps extends ReusableMethods {
    Screens screens = new Screens();

    @Given("App yuklensin")
    public void app_yuklensin() {
        Driver.getAppiumDriver();
    }

    @And("kullanici ana ekranda")
    public void kullaniciAnaEkranda() {
        Assert.assertTrue(isElementPresent(screens.mainScreen().mainScreenTitle));
    }

    @And("kullanici API Demos butununa tikladi")
    public void kullaniciAPIDemosButununaTikladi() {
        tapOn(screens.mainScreen().apiDemosButton);
    }

    @Then("kullanici API Demos ekraninda")
    public void kullaniciAPIDemosEkraninda() {
        Assert.assertTrue(isElementPresent(screens.apiDemosScreen().apiDemosTitle));
    }

    @And("kullanici Preference butununa tikladi")
    public void kullaniciPreferenceButununaTikladi() {
        tapOn(screens.apiDemosScreen().preference);
    }

    @Then("kullanici Preference ekraninda")
    public void kullaniciPreferenceEkraninda() {
        Assert.assertTrue(isElementPresent(screens.preferenceScreen().preferenceScreenTitle));
    }

    @And("kullanici Preference dependencies tikladi")
    public void kullaniciPreferenceDependenciesTikladi() {
        tapOn(screens.preferenceScreen().preferenceDependencies);
    }

    @And("kullanici WiFi check box secmis olacak")
    public void kullaniciWiFiCheckBoxSecmisOlacak() {
        if (screens.preferenceDependenciesScreen().checkBox.getAttribute("checked").equals("false")) {
            tapOn(screens.preferenceDependenciesScreen().checkBox);
        }
    }

    @And("kullanici WiFi Settings tikladi")
    public void kullaniciWiFiSettingsTikladi() {
        tapOn(screens.preferenceDependenciesScreen().wifiSettings);
    }

    @Then("WiFi setting popup geldi")
    public void wifiSettingPopupGeldi() {
        Assert.assertTrue(isElementPresent(screens.preferenceDependenciesScreen().cancelButton));
    }

    @And("kullanici {string} yazdi")
    public void kullaniciYazdi(String text) {
        enterText(screens.preferenceDependenciesScreen().textBox, text);
    }

    @And("kullanci ok butonuna tikladi")
    public void kullanciOkButonunaTikladi() {
        tapOn(screens.preferenceDependenciesScreen().okButton);
    }

    @And("kullanici Switches tikladi")
    public void kullaniciSwitchesTikladi() {
        tapOn(screens.preferenceScreen().switchButon);
    }

    @And("kullanici check box tikladi")
    public void kullaniciCheckBoxTikladi() {
        tapOn(screens.switchScreen().checkBox);
    }

    @And("kulanici switch butonuna tikladi")
    public void kulaniciSwitchButonunaTikladi() {
        tapOn(screens.switchScreen().firstSwitch);
    }

    @And("check box secili olmali")
    public void checkBoxSeciliOlmali() {
        if (screens.preferenceDependenciesScreen().checkBox.getAttribute("checked").equals("false")) {
            tapOn(screens.switchScreen().checkBox);
        }
    }

    @And("ilk switch butonu kapali")
    public void ilkSwitchButonuKapali() {
        if (screens.switchScreen().firstSwitch.getText().equals("ON")) {
            tapOn(screens.switchScreen().firstSwitch);
        }
    }

    @And("ikici switch butonu acik")
    public void ikiciSwitchButonuAcik() {
        if (screens.switchScreen().secondSwitch.getText().equals("NO")) {
            tapOn(screens.switchScreen().secondSwitch);
        }
    }

    @And("kullanici {string} butununa tikladi")
    public void kullaniciButununaTikladi(String text) {
        tapOnElementWithText(text);
    }

    @Then("kullanici {string} ekraninda")
    public void kullaniciEkraninda(String text) {
        isElementPresent(text);
    }

    @And("{int} saniye bekle")
    public void saniyeBekle(int saniye) {
        wait(saniye);
    }
}
