package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import pages.WikiPage;
import utilities.Driver;

public class WikiDefinitions {
    WikiPage wp=new WikiPage();
    Actions action=new Actions(Driver.getDriver());
    @Then("go to table which name is List of companies acquired by Dell Inc.")
    public void goToTableWhichNameIsListOfCompaniesAcquiredByDellInc() {
        action.sendKeys(Keys.PAGE_DOWN).moveToElement(wp.findTableElement).perform();
    }
    @Then("print row {int} of the table on console")
    public void print_row_of_the_table_on_console(Integer int1) {
        String specificRow=wp.selectRowElement(int1).getText();
        System.out.println(specificRow);
    }
    @And("also print on console the second and third elements  in line {int}.")
    public void alsoPrintOnConsoleTheSecondAndThirdElementsInLine(int arg0) {
        wp.selectCellElement(arg0);
    }
    @Then("Verify that Compellent appears in the first cell of line {int}")
    public void verify_that_compellent_appears_in_the_first_cell_of_line(Integer int1) {
        String actualWord=wp.selectFirstColumFromSpecificRow(int1).getText();
        Assert.assertTrue(actualWord.equals("Compellent"));
    }
}
