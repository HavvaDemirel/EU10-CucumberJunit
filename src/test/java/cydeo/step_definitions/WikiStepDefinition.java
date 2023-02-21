package cydeo.step_definitions;

import cydeo.pages.WikiPage;
import cydeo.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class WikiStepDefinition {
    WikiPage wikiPage;
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
        wikiPage = new WikiPage();

    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikiPage.searchBox.sendKeys(string);



    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchButton.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        //verify actual title contains String (coming from feature file
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }


    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String string) {
        Assert.assertTrue(wikiPage.mainHeader.isDisplayed());
    }



    @Then("User sees {string} is in the image header")
    public void userSeesStringIsInTheImageHeader(String string) {
        Assert.assertTrue(wikiPage.imageHeader.isDisplayed());
    }


}
