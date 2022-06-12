package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
 @FindBy(xpath = "(//*[@id=\"item-1\"])[2]")
    public WebElement alertButton;
    @FindBy(xpath = "//button[@id=\"timerAlertButton\"]")
    public WebElement willAppearFiveSeconds;
    @FindBy(id = "visibleAfter")
    public WebElement enableAfter5Min;
    @FindBy(id = "enableAfter")
    public WebElement visibleAfter5Min;
    @FindBy(id="colorChange")
    public WebElement colorChangeButton;

}
