package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.Screens;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class ViewsSteps extends ReusableMethods {
    Screens screens = new Screens();
    TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

    @And("kullanici Views butonuna tikladi")
    public void kullaniciViewsButonunaTikladi() {
        tapOn(screens.apiDemosScreen().views);
    }

    @Then("kullanici Views ekraninda")
    public void kullaniciViewsEkraninda() {
        Assert.assertTrue(isElementPresent(screens.viewsScreen().viewsTitle));
    }

    @And("kullanici Drag and Drop butonuna tikladi")
    public void kullaniciDragAndDropButonunaTikladi() {
        tapOn(screens.viewsScreen().dragDropButton);
    }

    @When("kullanici birinci topu ikici topun ustune brakti")
    public void kullaniciBirinciTopuIkiciTopunUstuneBrakti() {
        touchAction.longPress(ElementOption.element(screens.dragAndDropScreen().firstDot))
                .moveTo(ElementOption.element(screens.dragAndDropScreen().secondDot)).release().perform();
    }

    @Then("kullanici dorduncu top gorecek")
    public void kullaniciDorduncuTopGorecek() {
        Assert.assertTrue(isElementPresent(screens.dragAndDropScreen().hiddenDot));
    }

    @And("kullanici {int} tiklasin")
    public void kullaniciTiklasin(int saat) {
        tapOn(screens.dateWidgetsScreen().num9);
        wait(4);
    }

    @And("kulanici {int} ten {int} e yesil topu kaydirsin")
    public void kulaniciTenEYesilTopuKaydirsin(int dakika1, int dakika2) {
        touchAction.press(ElementOption.element(screens.dateWidgetsScreen().num15))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(ElementOption.element(screens.dateWidgetsScreen().num45)).release().perform();
    }

    @And("kullanici {string} butununa uzun basti")
    public void kullaniciButununaUzunBasti(String text) {
        touchAction.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(Driver.getAppiumDriver().findElementByXPath("//android.widget.TextView[@text='"+text+"']"))))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
    }
}
