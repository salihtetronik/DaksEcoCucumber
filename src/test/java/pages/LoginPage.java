package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends BasePage{

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")

    public WebElement password;

    @FindBy(xpath = "//div[@class='loginButton de_DE']")

    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='WICButton_TEXT ']")
    public WebElement abmelden;

    @FindBy(xpath = "//div[@class='errorMesage']")

    public WebElement errorMesage;



    WebElement myElement;

    public void findElementAndClickFunktion(String element){

        switch (element){
            case "loginButton":
                myElement=loginButton;
                break;
        }
        clickFunktion(myElement);
    }

    public void findElementAndSendkeysFunktion(String element, String value){

        switch (element){
            case "userName":
                myElement=userName;
                break;

            case "password":
                myElement = password;
                break;
        }
        sendkeysFunktion(myElement,value);
    }
}
