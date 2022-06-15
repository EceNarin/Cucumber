package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReddiffPage {
    public ReddiffPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class=\"hmsprite logo\"]")
    public WebElement logo;
    @FindBy(xpath = "//iframe[@id=\"moneyiframe\"]")
    public WebElement moneyIframe;
    @FindBy(xpath = "//span[@id=\"NseChange\"]")
    public WebElement NSE;
    @FindBy(xpath = "//div[@class=\"navbar\"]//ul//li")
    public List<WebElement> homeMenu;
    @FindBy(xpath = "//*[@id=\"red_container_main\"]/div[39]/h2/a")
    public WebElement getAhead;
    @FindBy(xpath = "/html/body/div[5]/div[2]/ul/li/a")
    public List<WebElement> altMenu;
    @FindBy(xpath = "//h1[@class=\"hdlinetitle businesscolor\"]")
    public WebElement technoTitle;
    @FindBy(xpath = "//div[@class=\"cell topicons\"]//a")
    public List <WebElement> headMenu;
    @FindBy (xpath = "//div[@id=\"sensTab2\"]")
    public WebElement NSETab;
    @FindBy
    public WebElement gainers;
    @FindBy(xpath = "//div[@class=\"div_secto_tabs\"]//a//h5")
    public List<WebElement> sectoralIndiciesValue;

    //div[@class="div_secto_tabs"]//a//div/h5
    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[10]/div[4]/a//b")
    public List<WebElement> sectoralIndicies;

    @FindBy
    public WebElement ğ;
    @FindBy
    public WebElement j;

    public WebElement gainersFind(int int1){
        gainers=Driver.getDriver().findElement(By.xpath("//*[@id=\"nseGainerDiv\"]/div["+int1+"]/div[3]"));
        return gainers;

    }


public WebElement choiceHomeMenu(List<WebElement>list ,String str){
    WebElement x=null;
    for (WebElement w:list) {
        if(w.getText().equals(str)){
            x=w;
        }
    }
    return x;
}

}
