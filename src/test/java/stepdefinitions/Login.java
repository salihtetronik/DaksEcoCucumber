package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class Login {

    LoginPage login = new LoginPage();

    @Given("Navigieren Sie zur tetronikwebseite")
    public void navigieren_sie_zur_tetronikwebseite() {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        Driver.getDriver().get("http://127.0.0.1/");
       Driver.getDriver().manage().deleteAllCookies();
    }

    @Given("der Benutzer gibt Benutzernamen und Passwort ein")
    public void der_benutzer_gibt_benutzernamen_und_passwort_ein() {

        login.findElementAndSendkeysFunktion("userName","sysadm");
        login.findElementAndSendkeysFunktion("password","sysadm");
    }

    @Given("der benutzer klickt auf die Anmeldescaltflache")
    public void der_benutzer_klickt_auf_die_anmeldescaltflache() {

        login.findElementAndClickFunktion("loginButton");
    }

    @Then("Der Benutzer sollte sich erfolgreich anmelden")
    public void der_benutzer_sollte_sich_erfolgreich_anmelden() {

        String actual = ReusableMethods.getVisibilityOfWait(login.abmelden).getText();
        System.out.println(actual);
        String expected = "abmelden";
        Assert.assertTrue(actual.equalsIgnoreCase("abmelden"));
       Assert.assertTrue(expected.equalsIgnoreCase(actual));

    }
}
