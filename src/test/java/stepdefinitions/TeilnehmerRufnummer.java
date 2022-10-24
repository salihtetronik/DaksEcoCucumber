package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.TeilnehmerRufnummerPage;
import utilities.ReusableMethods;

public class TeilnehmerRufnummer {

TeilnehmerRufnummerPage rufnummerPage = new TeilnehmerRufnummerPage();

    @Then("der benutzer loscht in der Rufnummernfelder")
    public void der_benutzer_loscht_in_der_rufnummernfelder() {

rufnummerPage.loschtRufnummernFelder();
    }

    @Then("der benutzer schickt auf der Rufnummernfelder {string}")
    public void der_benutzer_schickt_auf_der_rufnummernfelder(String text) {
rufnummerPage.findElementAndSendkeysFuntion("rufnummerFelder",text);
    }

    @Then("der Benutzer sieht, dass den sichernsbutton aktiv ist")
    public void der_benutzer_sieht_dass_den_sichernsbutton_aktiv_ist() {

rufnummerPage.istActiviertSichernButton();
    }
}