package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ReusableMethods;

import java.util.Map;
import java.util.TreeMap;

public class ExcelStepDefinitions {
    String excelPath="D:\\Downloads\\ulkeler.xlsx";
    @Given("user in {string} excel")
    public void userInExcel(String arg0) {

    }
    @Then("{int}.satirdaki {int}.hucreye gidelim ve yazdiralim")
    public void satirdaki_hucreye_gidelim_ve_yazdiralim(Integer int1, Integer int2) {
        String expectedCellNum=ReusableMethods.readExcel(excelPath)
                .getSheet("Sayfa1")
                .getRow(int1)
                .getCell(int2)
                .toString();
        System.out.println(expectedCellNum);
    }
    @And("baskenti {string} olan ulke ismini yazdiralim")
    public void baskentiOlanUlkeIsminiYazdiralim(String arg0) {
        int sizeRow=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getLastRowNum();
        int sizeCell=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getRow(1).getLastCellNum();
        String actualCountry="";
        for(int i=0;i<sizeRow;i++){
            for(int j=0;j<sizeCell;j++){
                if(ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(j).toString().equalsIgnoreCase(arg0)){
                    actualCountry=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(0).toString();
                    System.out.println(ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(0).toString());
                }
            }
        }
        Assert.assertTrue(actualCountry.equals("Indonesia"));

    }
    @Then("Ulke sayisini bulalim")
    public void ulke_sayisini_bulalim() {
        int sizeRow=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getLastRowNum();
        System.out.println(sizeRow);
    }
    @And("ulke sayisinin {int} oldugunu test edelim")
    public void ulkeSayisininOldugunuTestEdelim(int arg0) {
        int sizeRow=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getLastRowNum();
        Assert.assertEquals(sizeRow,arg0);
    }
    @Then("Fiziki olarak kullanilan satir sayisini bulun")
    public void fiziki_olarak_kullanilan_satir_sayisini_bulun() {
      int physicalRow=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
              .getPhysicalNumberOfRows();
        System.out.println("physicalRow" + physicalRow);
    }
    @Then("Tum bilgileri map olarak kaydedelim")
    public void tum_bilgileri_map_olarak_kaydedelim() {
        int sizeRow=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getLastRowNum();
        int sizeCell=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getRow(1).getLastCellNum();
        Map<String,String> map=new TreeMap<>();
        String str1="";
        String str2="";
        for(int i=1;i<sizeRow;i++){
            for(int j=0;j<sizeCell;j++){
                str1=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(0).getCell(j).toString();
                str2=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(j).toString();
                map.put(str1,str2);
            }
        }
        System.out.println(map);

    }
    @And("baskenti {string} olan ulkenin tum bilgilerini yazdiralim")
    public void baskentiOlanUlkeninTumBilgileriniYazdiralim(String arg0) {
        int sizeRow=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getLastRowNum();
        int sizeCell=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getRow(1).getLastCellNum();
        for(int i=0;i<sizeRow;i++){
            for(int j=0;j<sizeCell;j++){
                if(ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(j).toString().equalsIgnoreCase(arg0)){
                    System.out.println(ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(j).toString());
                }
            }
    }
    }
    @And("{string} ve {string} ile hucre yazdiralim")
    public void veIleHucreYazdiralim(String arg0, String arg1) {
        int sizeRow=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getLastRowNum();
        int sizeCell=ReusableMethods.readExcel(excelPath).getSheet("Sayfa1")
                .getRow(1).getLastCellNum();
        String actualCountry="";
        for(int i=0;i<sizeRow;i++){
            for(int j=0;j<sizeCell;j++){
                if(ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(j).toString().equalsIgnoreCase(arg0)){
                  if(ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(0).getCell(j).toString().equals(arg1)){
                      System.out.println(ReusableMethods.readExcel(excelPath).getSheet("Sayfa1").getRow(i).getCell(j).toString());
                  }
                }
            }
        }
    }



}
