package cydeo.step_definitions;

import cydeo.pages.WebTablePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webTable_StepDefinitions {
WebTablePage webTablePage = new WebTablePage();

    @Given("user is on login page of web table app")
    public void user_is_on_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);

    }

    @When("user enter username {string}")
    public void user_enter_username(String string) {

        webTablePage.inputUserNameBox.sendKeys(string);


    }
    @When("user enter password {string}")
    public void user_enter_password(String string) {
        webTablePage.inputUserPasswordBox.sendKeys(string);

    }

   
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePage.loginButton.click();

    }
    @Then("user should see url contains order")
    public void user_should_see_url_contains_order() {
        BrowserUtils.verifyURLContains("orders");


    }

    @When("user enter username {string} password {string} and logins")
    public void user_enter_username_password_and_logins(String string, String string2) {

      /*  webTablePage.inputUserNameBox.sendKeys(string);

        webTablePage.inputUserPasswordBox.sendKeys(string2);

        webTablePage.loginButton.click();
        */ // instead of this line we will create a method in the page file and pass the parameters

        webTablePage.login(string,string2);

    }






}
