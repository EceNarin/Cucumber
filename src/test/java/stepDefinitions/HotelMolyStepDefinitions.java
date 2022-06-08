package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMoly;
import utilities.ConfigReader;

public class HotelMolyStepDefinitions {
    HotelMoly moly=new HotelMoly();
    @Then("user click login button")
    public void userClickLoginButton() {
    moly.logIn.click();
    }

    @And("user input valid {string}")
    public void userInputValid(String arg0) {
    moly.username.sendKeys(ConfigReader.getProperty("molyUser"));
    }

    @And("user input validy {string}")
    public void userInputValidy(String arg0) {
     moly.password.sendKeys(ConfigReader.getProperty("molyPassword"));
    }

    @And("user click on submit button")
    public void userClickOnSubmitButton() {
      moly.submit.click();
    }

    @Then("verify to navigate expected page")
    public void verifyToNavigateExpectedPage() {
        Assert.assertTrue(moly.successLogin.isDisplayed());
    }

    @And("user input invalid {string}")
    public void userInputInvalid(String arg0) {
        moly.username.sendKeys(ConfigReader.getProperty("wrongUsername"));
    }

    @And("user input invalidy {string}")
    public void userInputInvalidy(String arg0) {
        moly.password.sendKeys(ConfigReader.getProperty("wrongPassword"));
    }

    @Then("verify unsuccess login")
    public void verifyUnsuccessLogin() {
        Assert.assertTrue(moly.UnSuccessLogin.isDisplayed());
    }

}
