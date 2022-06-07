package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercise;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class AEStepDefinitions {
    AutomationExercise ae=new AutomationExercise();
    Actions actions=new Actions(Driver.getDriver());
     String searchedProduct="Tshirt";
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
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement brand=Driver.getDriver().findElement(By.xpath("//div[@class=\"brands_products\"]/h2"));
        Assert.assertTrue(brand.isDisplayed());
    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        int size=Driver.getDriver().findElements(By.xpath("//div[@class=\"brands-name\"]//ul//li")).size();
      Driver.getDriver().findElement(By.xpath("//div[@class=\"brands-name\"]//ul//li["+new Random().nextInt(size)+"]")).click();

    }

    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
      Assert.assertTrue(ae.titleText.isDisplayed());
    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        int size=Driver.getDriver().findElements(By.xpath("//div[@class=\"brands-name\"]//ul//li")).size();
        Driver.getDriver().findElement(By.xpath("//div[@class=\"brands-name\"]//ul//li["+new Random().nextInt(size)+"]")).click();


    }

    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
      boolean proVerify=  Driver.getDriver().findElement(By.xpath("//a[@href=\"/products\"]")).isDisplayed();
      Assert.assertTrue(proVerify);
      Assert.assertTrue(ae.titleText.getText().startsWith("BRAND"));
    }


    @Then("Click on {string} button")
    public void clickOnButton(String topMenu) {

        ae.choiceFromTopMenu(topMenu.toLowerCase()).click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
       actions.sendKeys(Keys.PAGE_DOWN).perform();
       Assert.assertTrue(ae.titleText.getText().equals("ALL PRODUCTS"));
    }

    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
     Driver.getDriver().findElement(By.xpath("//input[@id=\"search_product\"]")).sendKeys(searchedProduct );
     Driver.getDriver().findElement(By.xpath("//button[@id=\"submit_search\"]")).click();
    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
    int sizeSearchedPro= Driver.getDriver().findElements(By.xpath("/html/body/section[2]/div/div/div[2]/div/div")).size();
    Assert.assertTrue(sizeSearchedPro!=1);
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        List<WebElement> listAll=Driver.getDriver().findElements(By.xpath("/html/body/section[2]/div/div/div[2]/div/div"));
                //.findElements(By.xpath("//div[@class=\"product-overlay\"]"));
        String chary="shirt";
     boolean ifHave= listAll.stream().anyMatch(t->t.getText().toLowerCase().contains(chary));
     Assert.assertTrue(ifHave);
    }

    @And("Add those products to cart")
    public void addThoseProductsToCart() {
     List<WebElement> addList=Driver.getDriver().findElements(By.xpath("//a[@class=\"btn btn-default add-to-cart\"]"));
    int size= addList.size();
      for (int i=0;i<size/2;i++){
          addList.get(i).click();
          ae.continueShop.click();
      }
    }

    @And("verify that products are visible in cart")
    public void verifyThatProductsAreVisibleInCart() {
      int size= Driver.getDriver().findElements(By.xpath("//tbody//tr//td[2]")).size();
       Assert.assertTrue(size!=0);

    }

    @And("close driver")
    public void closeDriver() {
        Driver.getClose();
    }
    @And("Click on Cart button")
    public void clickOnCartButton() {
        ae.viewButtonCart.click();
    }

    @And("Click Signup Login button and submit login details Again, go to Cart page")
    public void clickSignupLoginButtonAndSubmitLoginDetailsAgainGoToCartPage() {
        ae.signInSignUp.click();
        actions.click(ae.userMail).sendKeys(ConfigReader.getProperty("aeMail")).sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("aePassword"))
        .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }
}
