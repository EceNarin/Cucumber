package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPractice {
    public AutomationPractice(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class=\"login\"]")
    public WebElement logIn;
    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    public WebElement createAccountButton;
    @FindBy (xpath = "//input[@id=\"email_create\"]")
    public WebElement emailInput;
    @FindBy
    public WebElement genderButton;
    @FindBy (xpath = "//button[@id=\"submitAccount\"]")
    public WebElement register;
    @FindBy (xpath = "//*[@id=\"create_account_error\"]/ol/li")
    public WebElement inValidMail;

    public WebElement choiceGenderMale1Female2(int x){
        return genderButton= Driver.getDriver().findElement(By.xpath("//input[@id=\"id_gender"+x+"\"]"));
    }
}
