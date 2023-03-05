package cydeo.step_definitions;

import cydeo.pages.DropdownsPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTablesStepDefinition {
    DropdownsPage dropdownsPage = new DropdownsPage();
    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        Select select = new Select(dropdownsPage.monthDropDown);
       List<WebElement>actualOptionsAsWebElement= select.getOptions();

       //create a list of string and pass all of the actual web element options string into that new list
        List<String> actualOptions = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement){
            actualOptions.add(each.getText());
        }
        Assert.assertEquals(expectedMonths,actualOptions);
        //assert will check size of the list first if it is matching it will check one by one

    }
    @Then("User should see below info in days dropdown")
    public void user_should_see_below_info_in_days_dropdown(List<String>expectedDays) {
       List<String> actualDays = BrowserUtils.dropdownOptionsAsString(dropdownsPage.dayDropDown);
        Assert.assertEquals(expectedDays,actualDays);

    }

}
