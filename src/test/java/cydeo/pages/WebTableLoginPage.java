package cydeo.pages;

import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUserNameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputUserPasswordBox;
    @FindBy(xpath = "//button[@class='btn btn-primary login__submit']")
    public WebElement loginButton;


    public void login(){
        this.inputUserNameBox.sendKeys("Test");
        this.inputUserPasswordBox.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two argument and login
     * @param username
     * @param password
     */
    public void login(String username,String password){
        inputUserNameBox.sendKeys(username);
        inputUserPasswordBox.sendKeys(password);
        loginButton.click();
    }

    /**
     * this method will login using credential from configuration reader
     */
    public void loginWithConfig(){
        inputUserNameBox.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputUserPasswordBox.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }









}
