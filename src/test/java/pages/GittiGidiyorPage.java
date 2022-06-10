package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class GittiGidiyorPage {
    public GittiGidiyorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement searchBox;
    @FindBy
    public WebElement selectPage;
    @FindBy (xpath = "//li[@class=\"sc-1nx8ums-0 dyekHG\"]")
    public List<WebElement> productList;
    @FindBy(xpath = "(//i[@class=\"gg-icon gg-icon-bin-medium\"])[1]")
    public WebElement deleteFromBasket;
    @FindBy
    public WebElement selectProductRandom;
    //table[@id="sp-productTabFeatures"]//tbody//tr
    @FindBy (xpath = "//table[@id=\"sp-productTabFeatures\"]//tbody//tr")
    public List<WebElement> productFields;
    @FindBy (xpath = "//button[@id=\"add-to-basket\"]")
    public WebElement addToBasket;
    @FindBy (xpath = "(//span[@id=\"sp-price-highPrice\"])[1]")
    public WebElement price;
    @FindBy(xpath = "//div[@class=\"basket-container robot-header-iconContainer-cart\"]")
    public WebElement moveToBasket;
    @FindBy(linkText = "Sepete Git")
    public WebElement goToBasket;
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[3]/section[1]/section[2]/a/span")
    public WebElement coockiesCloseButton;
    public WebElement getSelectPage(int x){
        return selectPage=Driver.getDriver().findElement(By.xpath("//a[@aria-label=\""+x+". sayfa\"]"));
    }
    public WebElement getSelectedPoduct(){
       int size=productList.size()-1;
        Random rnd=new Random();
        int random=rnd.nextInt(size)+1;
        return selectProductRandom=Driver.getDriver().findElement(By.xpath("(//li[@class=\"sc-1nx8ums-0 dyekHG\"])[3]"));
    }

}
