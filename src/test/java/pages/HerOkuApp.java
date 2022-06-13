package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuApp {
    public HerOkuApp() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[@onclick=\"addElement()\"]")
    public WebElement addElementButton;
    @FindBy (xpath = "//button[@onclick=\"deleteElement()\"]")
    public WebElement deleteButton;
    //div[@id="elements"]

    @FindBy (xpath = "//div[@id=\"elements\"]//button")
    public List<WebElement> deletElementsButtonList;

    @FindBy(xpath = "//div[@id=\"column-a\"]")
    public WebElement dragSource;

    @FindBy(xpath = "//div[@id=\"column-b\"]")
     public WebElement dragTarget;
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li/a")
    public List<WebElement> takeElement;
    @FindBy(xpath = "//*[@id=\"column-b\"]/header")
    public WebElement headerAfterDragAndDrop;
    @FindBy(linkText = "Elemental Selenium")
    public WebElement elementalSelenium;
    @FindBy(xpath = "//a[@href=\"https://saucelabs.com/\"]")
    public WebElement sauceLab;
    @FindBy(xpath = "//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[6]/div[2]/div/div/div/ul/li/div/ul/li[2]/div/ul/li[1]/div/ul/li/a/span")
    public WebElement contactSupport;
    @FindBy(xpath = "(//div[@data-hover-content=\"Contact\"])[2]")
    public WebElement contact;
    public WebElement choiceYourElement(List<WebElement>takeElement,String str){
        WebElement element=null;
        for (WebElement w:takeElement) {
            if(w.getText().equalsIgnoreCase(str)){
                element=w;
            }
        }
        return element;
    }

}
