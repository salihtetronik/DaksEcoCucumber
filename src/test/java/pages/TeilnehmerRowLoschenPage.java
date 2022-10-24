package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.util.List;

public class TeilnehmerRowLoschenPage extends BasePage{

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[1]")
    public WebElement richtungstaste;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[1]")
    public WebElement richtungstaste1;
    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[2]")
    public WebElement richtungstaste2;
    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[3]")
    public WebElement richtungstaste3;
    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[4]")
    public WebElement richtungstaste4;
    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[5]")
    public WebElement richtungstaste5;
    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[6]")
    public WebElement richtungstaste6;
    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[7]")
    public WebElement richtungstaste7;

    @FindAll({@FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a")})
    public List<WebElement> richtungstasteList;

    @FindAll({@FindBy(xpath = "(//table)[3]//tr")})
    public List<WebElement> tabelleRow;

    @FindBy(xpath = "(//table)[3]//tr[1]")
    public WebElement tabelleRow1;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[4]")
    public WebElement loschenButton;

    @FindBy(xpath = "//div[@class='WICButton_TEXT WICMessageBox_ButtonYes']")
    public WebElement jaButton;


    WebElement myElement;

    public void clickElementMethod(String element){


       switch (element){

           case "richtungstaste5":
               myElement=richtungstaste5;
               break;

           case "loschenButton":
               myElement=loschenButton;
               break;

           case "jaButton":
               myElement=jaButton;
               break;

           case "richtungstaste3":
               myElement=richtungstaste3;
               break;
       }
       clickFunktion(myElement);
    }

public void loschenMethod(){

    ReusableMethods.getVisibilityOfWait(tabelleRow1);
    for (int i = 0; i < tabelleRow.size(); i++) {
        tabelleRow.get(i).click();
        loschenButton.click();
        ReusableMethods.getVisibilityOfWait(jaButton).click();

    }
}

}
