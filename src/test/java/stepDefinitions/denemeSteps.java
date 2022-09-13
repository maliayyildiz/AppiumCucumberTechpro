package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import screens.androidScreen.PreferenceDependenciesScreen;
import screens.androidScreenByMetods.PreferanceDepencyScreen;
import utils.Driver;

public class denemeSteps extends PreferanceDepencyScreen {



    @Given("app acilir")
    public void appAcilir() {
        Driver.getAppiumDriver();
    }


    @And("api demos tiklanir")
    public void apiDemosTiklanir() {
        wait(3000);
        apiDemosButton_click();
    }

    @When("acilan ekrandan preferance tiklanir")
    public void acilanEkrandanPreferanceTiklanir() {
        wait(3000);
        preferanceButon_click();
    }

    @And("preferance depency tiklanir")
    public void preferanceDepencyTiklanir() {
        wait(3000);
        preferanceDepencyButton_click();
    }

    @Given("checkbox {string} olmalidir")
    public void checkboxOlmalidir(String value) {
        wifiCheckBoxButton_click("false");
    }
    public void wait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
