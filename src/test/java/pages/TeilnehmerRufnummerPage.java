package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class TeilnehmerRufnummerPage extends BasePage{


    @FindBy(xpath = "(//table)[3]//tr[1]/td[2]")
    public WebElement tabelleRufnummer1;

    @FindBy(xpath = "(//table)[3]//tr[3]/td[2]")
    public WebElement tableRufnummer3;

    @FindBy(xpath = "(//table)[3]//tr[197]/td[2]")
    public WebElement tabelleRufnummer197;

    @FindBy(xpath = "(//table)[3]//tr[198]/td[2]")
    public WebElement tableRufnummer198;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[1]")
    public WebElement bearbeitenButton;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[2]")
    public WebElement neuButton;

    @FindBy(xpath = "//div[@class='WICButton_TEXT WICMessageBox_ButtonYes']")
    public WebElement jaButton;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[9]")
    public WebElement rufnummerFelder;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[1]")
    public WebElement sichernButton;

    /*
    public TeilnehmerRufnummerPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
     */
WebElement myElement;


    public void findElementAndSendkeysFuntion(String element, String value){

    switch (element){

        case "rufnummerFelder":
            myElement = rufnummerFelder;
            break;
    }
    sendkeysFunktion(myElement,value);
    }


    public void loschtRufnummernFelder(){
        ReusableMethods.sleep(1000);
        ReusableMethods.getVisibilityOfWait(rufnummerFelder).clear();
    }

    public void istActiviertSichernButton(){

        ReusableMethods.getVisibilityOfWait(sichernButton);
        Assert.assertTrue(sichernButton.isEnabled());
    }




}
