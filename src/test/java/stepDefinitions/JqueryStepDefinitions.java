package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.JquaeryPage;
import utilities.Driver;

import java.util.List;

public class JqueryStepDefinitions {
    JquaeryPage jq=new JquaeryPage();
    Actions action=new Actions(Driver.getDriver());
    Faker fake=new Faker();
    @Then("{int} . emojiye tiklayin")
    public void emojiyeTiklayin(int arg0) {
        Driver.getDriver().switchTo().frame(jq.iFrame);
        jq.chosenEmojiMethod(arg0).click();
    }
    @And("tum ikinci emoji ogelerini tiklayin")
    public void tumIkinciEmojiOgeleriniTiklayin() {
        List<WebElement> list=Driver.getDriver().findElements(By.xpath("//*[@id=\"nature\"]/div/img"));
       // list.stream().findAny().get().click();
        for (WebElement w:list) {
            w.click();
        }
    }


    @Then("parent iframe e geri donun")
    public void parent_iframe_e_geri_donun() {
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("formu istediginiz verilerle doldurun")
    public void formu_istediginiz_verilerle_doldurun() {
      action.click(jq.formText).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).sendKeys(fake.funnyName().name())
              .sendKeys(Keys.TAB).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).sendKeys(fake.funnyName().name())
              .sendKeys(Keys.TAB).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).sendKeys(fake.funnyName().name())
              .sendKeys(Keys.TAB).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).sendKeys(fake.funnyName().name()).sendKeys(Keys.TAB).perform();
    }
    @Then("apply butonuna basin")
    public void apply_butonuna_basin() {
      jq.applyButton.click();
    }



}
