package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TeilnehmerPage;
import utilities.ReusableMethods;

public class TeilnehmerLangenbegrenzeungenMessen extends ReusableMethods {

    TeilnehmerPage teilnehmer = new TeilnehmerPage();

    @Given("der benutzer klickt auf die schaltflache „Teilnehmer“")
    public void der_benutzer_klickt_auf_die_schaltflache_teilnehmer() {
        getVisibilityOfWait(teilnehmer.teilnehmerButton).click();

    }

    @Given("der benutzer gibt einen namen mit mehr als {int} Zeichen in das namensfeld ein")
    public void der_benutzer_gibt_einen_namen_mit_mehr_als_zeichen_in_das_namensfeld_ein(Integer int1) {

        getVisibilityOfWait(teilnehmer.nameOrt).sendKeys("velideliqwertzuiopasdfghjklyxcvbnmäölkjhgfdsawetrzuioplkjhgffdsa");
        String value = teilnehmer.nameOrt.getAttribute("value");
        System.out.println(value + " value length =  " +  value.length());
        getVisibilityOfWait(teilnehmer.sichernButton).click();
        sleep(500);
        Assert.assertTrue(teilnehmer.neuButton.isDisplayed());
    }
}
