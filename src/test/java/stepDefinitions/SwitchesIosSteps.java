package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import screens.Screens;
import utils.ReusableMethods;

public class SwitchesIosSteps extends ReusableMethods {
    Screens screens =  new Screens();
    @Then("kullanici Switches ekraninda")
    public void kullaniciSwitchesEkraninda() {
       isElementPresent(screens.alertViewScreen().switchesTitle);
    }

    @And("kullanici ilk butonu acmali")
    public void kullaniciIlkButonuAcmali() {
        if (screens.switchesiOSScreen().firstSwitch.getText().equals("0")) {
            tapOn(screens.switchesiOSScreen().firstSwitch);
        }
    }

    @And("kullanici ikinci butonu kapamali")
    public void kullaniciIkinciButonuKapamali() {
        if (screens.switchesiOSScreen().secondSwitch.getText().equals("1")) {
            tapOn(screens.switchesiOSScreen().secondSwitch);
        }
    }
}
