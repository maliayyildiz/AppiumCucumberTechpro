package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

public class ApiDemosSteps extends ReusableMethods{
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
       if (screens.preferenceDependenciesScreen().checkBox.getAttribute("checked").equals("false")){
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


}
