package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void login() { // Before Class a alinacak
        Driver.getDriver().get("https://www.autotrader.com/");
    }

    public static void clearCookiees() {

        Driver.getDriver().manage().deleteAllCookies();
    }


    public void clickFunktion(WebElement element) {
        waitUntilClickable(element);
        scrollDown(element);
        element.click();
    }


    public void sendkeysFunktion(WebElement element, String value) {
        waitUntilVisible(element);
        scrollDown(element);
        element.clear();
        element.sendKeys(value);
    }


    public void waitUntilClickable(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void waitUntilVisible(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }


    public void scrollDown(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }



public void verifyElementContainsText(WebElement element,String text){

        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
        System.out.println(element.getText());
        Assert.assertTrue(element.getText().toLowerCase().contains(element.getText().toLowerCase()));
    }



    public static void sleep() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
