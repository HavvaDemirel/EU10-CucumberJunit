package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownsPage {
    public DropdownsPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "month")
    public WebElement monthDropDown;

    @FindBy(id="year")
    public WebElement yearDropDown;
    @FindBy(id="day")
    public WebElement dayDropDown;

    @FindBy(id="state")
    public WebElement stateDropDown;
    @FindBy(id="dropdown")
    public WebElement simpleDropDown;












}
