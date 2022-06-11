package pages;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {
    public GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }
    @FindBy (xpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]")
    public List<WebElement> columnElemnt;
    @FindBy(xpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr")
    public List<WebElement> istenenSatir;
    @FindBy
    public WebElement istenenSatirinHucresi;
    @FindBy
    public WebElement istenenCell;

    public WebElement istenenCellPro(String str1,String str2){
        int column=0;
        int row=0;
    List<WebElement> listColumn=Driver.getDriver().findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
    for(int i=0;i<listColumn.size();i++){
        if (listColumn.get(i).getText().equals(str2)) {
            column=i+1;
        }
    }
    for(int i=0;i<istenenSatir.size();i++){
        if(istenenSatir.get(i).getText().contains(str1)){
            row=i+1;
        }
    }

        return istenenCell=Driver.getDriver().findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td["+column+"]/a"));
    }
    public WebElement  istenenCell(List<WebElement>istenenSatir,String str){
          int size=istenenSatir.size();
          for(int i=0;i<size;i++){
              if(istenenSatir.get(i).getText().contains(str)){
                  int x=i+1;
                  istenenSatirinHucresi=Driver.getDriver().findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+x+"]/td[3]"));
              }
          }
            return istenenSatirinHucresi;
    }

}
