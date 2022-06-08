package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTable {
    public DataTable() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@class=\"dt-button buttons-create\"]")
    public WebElement newButton;
    @FindBy(xpath = "//div[@data-dte-e=\"form_buttons\"]")
    public WebElement createButton;
    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"row_19\"]/td[2]")
    public WebElement verifyIfAdd;
    @FindBy(xpath = "//tbody//tr//td[2]")
    public WebElement verifyName;
    @FindBy(xpath = "//input[@id=\"DTE_Field_first_name\"]")
    public WebElement fName;
    @FindBy(xpath = "//input[@id=\"DTE_Field_last_name\"]")
    public WebElement lName;
    @FindBy(xpath = "//input[@id=\"DTE_Field_position\"]")
    public WebElement position;
    @FindBy(xpath = "//input[@id=\"DTE_Field_office\"]")
    public WebElement office;
    @FindBy(xpath = "//input[@id=\"DTE_Field_extn\"]")
    public WebElement extension;
    @FindBy(xpath = "//input[@id=\"DTE_Field_start_date\"]")
    public WebElement startDate;
    @FindBy(xpath = "//input[@id=\"DTE_Field_salary\"]")
    public WebElement salary;



}
