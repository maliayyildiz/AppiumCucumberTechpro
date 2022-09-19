package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.Screens;
import screens.androidScreen.DragAndDropScreen;
import utils.Driver;
import utils.ReusableMethods;

import java.util.HashMap;

public class iOS extends ReusableMethods {
    Screens screens = new Screens();
    @When("kullanici alert view tikladi")
    public void kullaniciAlertViewTikladi() {
        screens.alertViewScreen().alertViewButton.click();
    }

    @And("okey butonuna tikladi")
    public void okeyButonunaTikladi() {
        wait(3);
        screens.alertViewScreen().okCancelButton.click();
    }

    @Then("popup ekran geldi")
    public void popupEkranGeldi() {
        isElementPresent(screens.alertViewScreen().popupText);
    }

    @And("ok butonuna tikladik")
    public void okButonunaTikladik() {
        tapOn(screens.alertViewScreen().okButton);
    }

    @When("kullanici Switches tiklasin ios")
    public void kullaniciSwitchesTiklasinIos() {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("value","Switches");
        Driver.getAppiumDriver().executeScript("mobile:scroll", scrollObject);

        tapOn(screens.alertViewScreen().switchesButton);


    }

}
