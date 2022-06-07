package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercise;
import utilities.Driver;

public class AEStepDefinitions {
    AutomationExercise ae=new AutomationExercise();
    Actions actions=new Actions(Driver.getDriver());
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

    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {

        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
       WebElement category= Driver.getDriver().findElement(By.xpath("//div[@class=\"left-sidebar\"]/h2"));
       Assert.assertTrue(category.getText().equalsIgnoreCase("Category"));
    }

    @And("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        String menPage=Driver.getDriver().findElement(By.xpath("//h2[@class=\"title text-center\"]")).getText();
        Assert.assertTrue(menPage.contains("MEN"));

    }

    @And("Click on Women category")
    public void clickOnWomenCategory() {
        Driver.getDriver().findElement(By.xpath("(//a[@data-toggle=\"collapse\"])[1]")).click();

    }

    @And("Click on any category link under Women category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        Driver.getDriver().findElement(By.xpath("//a[@href=\"/category_products/2\"]")).click();

    }

    @And("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
     String actualText=Driver.getDriver().findElement(By.xpath("//h2[@class=\"title text-center\"]")).getText();
     Assert.assertTrue(actualText.equals("WOMEN - TOPS PRODUCTS"));
    }

    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        Driver.getDriver().findElement(By.xpath("(//a[@data-toggle=\"collapse\"])[2]")).click();
        Driver.getDriver().findElement(By.xpath("//a[@href=\"/category_products/3\"]")).click();
    }



    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {

    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {

    }

    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {

    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {

    }

    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
    }

    @Then("Click on {string} button")
    public void clickOnProductsButton() {
    }
}
