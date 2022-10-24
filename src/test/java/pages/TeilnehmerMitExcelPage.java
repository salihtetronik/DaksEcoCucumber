package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.util.List;

public class TeilnehmerMitExcelPage extends ReusableMethods {

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[2]")
    public WebElement neuButton;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[1]")
    public WebElement nameOrt;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[8]")
    public WebElement mailAdresse;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[1]")
    public WebElement sichernButton;


    public void teilnehmerListHinZufugen(){

        List<List<String>> list = getListData("src/main/resources/TeilnehmerList.xlsx","Tabelle1",1);
        waitForPageToLoad(20);
        for (int i = 0; i < list.size(); i++) {
           getVisibilityOfWait(neuButton).click();
           waitForPageToLoad(20);
           getVisibilityOfWait(nameOrt).sendKeys(list.get(i).get(0));
           getVisibilityOfWait(sichernButton).click();
           sleep(500);
            Assert.assertTrue(neuButton.isEnabled());
        }



    }

}
