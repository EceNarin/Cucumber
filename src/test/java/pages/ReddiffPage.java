package pages;

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
    @FindBy
    public WebElement ç;
    @FindBy
    public WebElement v;
    @FindBy
    public WebElement m;
    @FindBy
    public WebElement h;
    @FindBy
    public WebElement i;
    @FindBy
    public WebElement ğ;
    @FindBy
    public WebElement j;


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
