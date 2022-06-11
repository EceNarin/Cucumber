package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikiPage {
    public WikiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//table[@class=\"wikitable sortable jquery-tablesorter\"]/caption")
    public WebElement findTableElement;
    @FindBy
    public WebElement allRowElement;
    @FindBy
    public WebElement rowFirstCell;
    @FindBy
    public WebElement rowSecondCell;
    @FindBy
    public WebElement specificRowFirstColumn;
    public WebElement selectFirstColumFromSpecificRow(int x){
      return specificRowFirstColumn=Driver.getDriver().findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr["+x+"]/th/a"));
    }
    public WebElement selectRowElement(int x){
        return allRowElement=Driver.getDriver().findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr["+x+"]"));
    }
    public void selectCellElement(int z){
        rowFirstCell=Driver.getDriver().findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr["+z+"]/td[1]/span"));
        rowSecondCell=Driver.getDriver().findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr["+z+"]/td[2]"));
        System.out.println(z +". row Second cell ; " + rowFirstCell.getText() +"\n " +"third Cell" + rowSecondCell.getText() );

    }
}
