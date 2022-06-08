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
    @FindBy (xpath = "//button[@onclick=\"deleteElement()\"]")
    public List<WebElement> deleteButtonList;
    @FindBy
    public WebElement addElementButton2;
    @FindBy
    public WebElement addElementButton3;

}
