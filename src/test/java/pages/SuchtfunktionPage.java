package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

public class SuchtfunktionPage extends ReusableMethods {


    @FindBy(xpath = "(//button[@name='MENU_BUTTON'])[10]")
    public WebElement teilnehmerButton;

    @FindBy(xpath = "//div[@class='WICTable_PAGINATORDIV GMDTable']/a[1]")
    public WebElement richtungstaste;

    @FindBy(xpath = "(//table)[3]//tr[1]")
    public WebElement tabelleRow1;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[1]")
    public WebElement nameOrt;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[8]")
    public WebElement mailAdresse;

    @FindBy(xpath = "//button[@title='Zum nächsten Eintrag springen']")
    public WebElement nextButton;


    String name = "cck@gmail.com";
    boolean gesuchtesWort = true;


    public void doubleClickTabelleRow() {
        sleep(6000);
        getVisibilityOfWait(richtungstaste);
        doubleClick(tabelleRow1);
        sleep(1000);
    }


    public void suchfunktionMethod() {

        for (int i = 0; i < 1200; i++) {
            getVisibilityOfWait(mailAdresse);
            String value = mailAdresse.getAttribute("value");
            if (value.contains(name)) {
                System.out.println(i + 1 + " , " + value + " steht in der Tabelle");
                Assert.assertEquals(value, name);
                gesuchtesWort = false;
                break;
            } else {
                getVisibilityOfWait(nextButton).click();
            }
        }
        if (gesuchtesWort) {
            System.out.println(name + " wurde nicht gefunden");
        }
    }

}
