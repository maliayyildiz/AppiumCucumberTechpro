package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.Screens;
import utils.ReusableMethods;

public class PickerViewSteps extends ReusableMethods {
     Screens screens = new Screens();
    @When("kullanici Picker View tikladi")
    public void kullaniciPickerViewTikladi() {
        tapOn(screens.alertViewScreen().pickerViewButton);
    }

    @Then("kullanici Picker View sayfasinda")
    public void kullaniciPickerViewSayfasinda() {
        isElementPresent(screens.pickerViewScreen().pickerViewTitle);
    }

    @And("kullanici ilk sutuna {string} yazdi")
    public void kullaniciIlkSutunaYazdi(String ilk) {
        screens.pickerViewScreen().firstColumn.sendKeys(ilk);
    }

    @And("kullanici ikinci sutuna {string} yazdi")
    public void kullaniciIkinciSutunaYazdi(String ikinci) {
        screens.pickerViewScreen().secondColumn.sendKeys(ikinci);
    }

    @And("kullanici ucuncu sutuna {string} yazdi")
    public void kullaniciUcuncuSutunaYazdi(String ucuncu) {
        screens.pickerViewScreen().thirdColumn.sendKeys(ucuncu);
    }

    @Then("kullanici yazdigi degerleri {string} {string} {string} gordu")
    public void kullaniciYazdigiDegerleriGordu(String ilk, String ikinci, String ucuncu) {
        Assert.assertEquals(screens.pickerViewScreen().firstColumn.getText(),ilk);
        Assert.assertEquals(screens.pickerViewScreen().secondColumn.getText(),ikinci);
        Assert.assertEquals(screens.pickerViewScreen().thirdColumn.getText(),ucuncu);
    }
}
