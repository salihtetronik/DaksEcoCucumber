package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NameOrtListHinZuPage {

    public NameOrtListHinZuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@name='MENU_BUTTON'])[10]")
    public WebElement teilnehmerButton;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[2]")
    public WebElement neuButton;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[1]")
    public WebElement nameOrt;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[8]")
    public WebElement mailAdresse;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[1]")
    public WebElement sichernButton;



/**
 * bu durumlarda yani bir satirlik kodlarda ayrica page icinde
 * ayri bir metoda gerek var mi???
 * Hocanin yaptigi framework uzerinde dusun,
 * hangi durumlarda oyle bir framework a ihtiyac duyulur
    public void sendkeysMethod(WebElement element, String text){

        nameOrt.sendKeys(text);
    }

 */
}
