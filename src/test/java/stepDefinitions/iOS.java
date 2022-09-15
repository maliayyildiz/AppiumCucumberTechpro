package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.Screens;
import utils.ReusableMethods;

public class iOS extends ReusableMethods {
    Screens screens = new Screens();
    @When("kullanici alert view tikladi")
    public void kullaniciAlertViewTikladi() {
        screens.alertViewScreen().alertViewButton.click();
    }

    @And("okey butonuna tikladi")
    public void okeyButonunaTikladi() {
        screens.alertViewScreen().okButton.click();
    }

    @Then("popup ekran geldi")
    public void popupEkranGeldi() {
        isElementPresent(screens.alertViewScreen().popupText);
    }

    @And("ok butonuna tikladik")
    public void okButonunaTikladik() {
        tapOn(screens.alertViewScreen().okButton);
    }
}
