package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class JquaeryPage {
    public JquaeryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//iframe[@id=\"emoojis\"]")
    public WebElement iFrame;
    @FindBy(xpath = "//button[@id=\"send\"]")
    public WebElement applyButton;
    @FindBy (xpath = "//input[@id=\"text\"]")
    public WebElement formText;
    @FindBy
    public WebElement chosenEmoji;

    public WebElement chosenEmojiMethod(int x){

        return chosenEmoji=Driver.getDriver().findElement(By.xpath("//div[@class=\"mdl-tabs__tab-bar\"]//a["+x+"]"));
    }


}
