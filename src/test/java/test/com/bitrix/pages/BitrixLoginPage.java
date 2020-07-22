package test.com.bitrix.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.com.bitrix.utilities.Driver;

public class BitrixLoginPage {

    public BitrixLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernamebox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordbox;

    @FindBy(className = "login-btn")
    public WebElement loginbutton;

}
