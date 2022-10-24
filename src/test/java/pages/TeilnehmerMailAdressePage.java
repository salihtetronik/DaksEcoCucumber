package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeilnehmerMailAdressePage extends BasePage {

    @FindBy(xpath = "(//button[@name='MENU_BUTTON'])[10]")
    public WebElement teilnehmerButton;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[2]")
    public WebElement neuButton;

    @FindBy(xpath = "(//input[@class='WICEdit SubsValue'])[8]")
    public WebElement mailAdresse;

    @FindBy(xpath = "(//button[@class='WICButton ActionButton'])[1]")
    public WebElement sichernButton;


    WebElement myElement;

    public void findElementAndClickFunktion(String element) {

        switch (element) {
            case "neuButton":
                myElement = neuButton;
                break;
        }
        clickFunktion(myElement);
    }

    public void findElementAndSendkeysFuntion(String element, String value) {

        switch (element) {
            case "mailAdresse":
                myElement = mailAdresse;
                break;
        }
        sendkeysFunktion(myElement, value);
    }

    public void mailAdresserechnen() {

        String value = mailAdresse.getAttribute("value");
        int index = value.indexOf("@");
        System.out.println(index);
        String gmail = value.substring(index + 1);
        System.out.println(gmail);
        String name = value.substring(0, index);
        System.out.println(name);

        if (value.contains("@") == false) {
            System.out.println("Sie sollen @ zeichen eingeben!");
        }
        if (gmail.equalsIgnoreCase("gmail.com") == false) {
            System.out.println("Gmail  Konto ist falsch! Bitte geben Sie ein richtiges Konto ein.");
        }
        if (name.equalsIgnoreCase("salih") == false) {
            System.out.println("Name der Mail ist falsch! Bitte geben Sie ein richtigen Name ein");
        }
        if (value.contains("@") && gmail.equals("gmail.com") && name.equals("salih")) {
            System.out.println("Gratuliere! Sie haben eine richtige E-Mail eingegeben.");
        }
        Assert.assertTrue(value.contains("@") && gmail.equalsIgnoreCase("gmail.com") && name.equalsIgnoreCase("salih"));

    }
}
