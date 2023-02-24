package cydeo.step_definitions;

import cydeo.pages.Orders.BasePage;
import cydeo.pages.Orders.OrderPage;
import cydeo.pages.Orders.ViewAllOrdersPage;
import cydeo.pages.WebTableLoginPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class Order_stepDefinitions {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();





    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        webTableLoginPage.login();
        basePage.Orders.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select( orderPage.productTypeDropdown);
                select.selectByVisibleText(string);


    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        orderPage.quantityDropdown.sendKeys(int1+"");
        //accepting int arg and sendin it useing sendkeys method
        //since send keys method only accepts string we need to convert it to string or we can use string value of method
        //eg orderPage.quantityDropdown.sendKeys(String.valueOf(int1));


        //initating pressin back space button from keybuard to delete existing input

        orderPage.quantityDropdown.sendKeys(Keys.BACK_SPACE);



    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {

        orderPage.inputName.sendKeys(string);


    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.inputStreet.sendKeys(string);

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.inputCity.sendKeys(string);


    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.inputState.sendKeys(string);

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.inputZip.sendKeys(string);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {

        BrowserUtils.clickRadioButton(orderPage.cardType,expectedCardType);

        /** we created a method in browser utils and we dont have to write all this methods*/
       /* List<WebElement>cardTypes= orderPage.cardType;

        for(WebElement each : cardTypes){
            if (each.getAttribute("value").equalsIgnoreCase(expectedCardType))
                each.click();
        }*/

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPage.cardNoInput.sendKeys(string);


    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPage.cardExpInput.sendKeys(string);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        orderPage.processOrderBtn.click();

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {

        String actualName = viewAllOrdersPage.newCustomerCell.getText();
        Assert.assertEquals(expectedName,actualName);

    }
}


