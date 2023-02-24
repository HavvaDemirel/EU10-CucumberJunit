package cydeo.pages.Orders;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*in this class we wil store web elements that are common to all pages*/
public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement wiewAllOrders;

    @FindBy(xpath = "//button[.='View all products']")
    public WebElement wiewAllProduct;
    @FindBy(xpath = "//button[.='Order']")
    public WebElement Orders;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logOutButton;
















}
