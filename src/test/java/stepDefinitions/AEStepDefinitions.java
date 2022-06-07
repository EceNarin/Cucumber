package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AutomationExercise;
import utilities.Driver;

public class AEStepDefinitions {
    AutomationExercise ae=new AutomationExercise();
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(ae.homePage.isDisplayed());
    }
    @Then("Add products to cart")
    public void add_products_to_cart() {
        ae.choiceProductChartByIndex(3).click();

    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
     Assert.assertTrue(ae.visibleIfCartPage.isDisplayed());
    }

    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() {
     Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[@class=\"text-center\"]/b")).getText().equals("Cart is empty!"));
    }



    @And("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        Driver.getDriver().findElement(By.xpath("//i[@class=\"fa fa-times\"]")).click();
    }

    @And("Click Cart button")
    public void clickCartButton() {
        ae.continueShop.click();
        ae.viewButtonCart.click();
    }
}
