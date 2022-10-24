package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.TeilnehmerPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class TeilnehmerAbspeichern {
    TeilnehmerPage teilnehmer = new TeilnehmerPage();

    @Given("der benutzer meldet sich auf der dakswebseite an")
    public void der_benutzer_meldet_sich_auf_der_dakswebseite_an() {

        Driver.getDriver().get("http://127.0.0.1");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
       // Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().deleteAllCookies();
        teilnehmer.userName.sendKeys("sysadm");
        teilnehmer.password.sendKeys("sysadm");
        teilnehmer.loginButton.click();
    }
    @Given("der benutzer klickt auf die Schaltflache „Teilnehmer“ ")
    public void der_benutzer_klickt_auf_die_schaltflache_teilnehmer() {

        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(5000);
    }
/*
    @Given("der benutzer kilckt auf den Neu Button")
    public void der_benutzer_kilckt_auf_den_neu_button() {
        teilnehmer.neuButton.click();
    }
Ayni metoddan 2 tane stepdefinition metodu varmis. dolaysiyla hata verdi. Test failed.
onun icin bu metod silindi

 */
    @Given("der benutzer fugt einen neuen Teilnehmer hinzu")
    public void der_benutzer_fugt_einen_neuen_teilnehmer_hinzu() {

        ReusableMethods.getVisibilityOfWait(teilnehmer.nameOrt).clear();
        teilnehmer.nameOrt.sendKeys("alivelideli");
        String value= teilnehmer.nameOrt.getAttribute("value");
        System.out.println(value + " ---- "+ value.length());
    }
    @Then("der benutzer klickt auf den sichernsbutton und sieht den Neu Button")
    public void der_benutzer_klickt_auf_den_sichernsbutton_und_sieht_den_neu_button() {
        ReusableMethods.getVisibilityOfWait(teilnehmer.sichernButton).click();
        Assert.assertTrue(teilnehmer.neuButton.isDisplayed());
    }



}
