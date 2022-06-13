package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TrivagoPage {
    public TrivagoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[4]/header/div[1]/nav/ul/li")
    public List<WebElement> staysCarsFlightsPackage;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/ul/li/div")
    public List<WebElement> allHotelHome;
    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchBox;
    @FindBy(xpath = "(//span[@class=\"flex flex-col text-s text-grey-900\"])[1]")
    public WebElement checkIn;
    @FindBy(xpath = "//time[@datetime=\"2022-07-21\"]")
    public WebElement date2;
    @FindBy(xpath = "//time[@datetime=\"2022-07-07\"]")
    public WebElement date1;
    @FindBy(xpath = "//button[@name=\"guest_rating_filters\"]")
    public WebElement guessRating;
    @FindBy(xpath = "//input[@data-testid=\"adults-amount\"]")
    public WebElement adult;
    @FindBy(xpath = "//*[@id=\"number-input-21\"]")
    public WebElement room;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/div[4]/div/div/div[2]/div/div[4]/button[2]/span/strong")
    public WebElement apply;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/div[2]/button/span/span[2]/span[2]")
    public WebElement roomAndAdultbutton;
    @FindBy(xpath = "//span[@class=\"w-full text-center font-bold\"]")
    public WebElement searchButton;











    public WebElement choices(List<WebElement> list, String str){
           WebElement x = null;
        for (WebElement w:list) {
           if(w.getText().equalsIgnoreCase(str)){
               x=w;
           }
        }

        return x;
    }
}
