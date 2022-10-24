package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.TeilnehmerMailAdressePage;
import utilities.ReusableMethods;

public class TeilnehmerMailAdresse {
TeilnehmerMailAdressePage mail = new TeilnehmerMailAdressePage();

    @Given("der benutzer kilckt auf den Neu Button")
    public void der_benutzer_kilckt_auf_den_neu_button() {
       ReusableMethods.sleep(4000);
    mail.findElementAndClickFunktion("neuButton");
    }
    @Given("der benutzer loscht in der Mailadressefelder")
    public void der_benutzer_loscht_in_der_mailadressefelder() {
        ReusableMethods.sleep(1000);
     mail.mailAdresse.clear();
    }
    @Given("der benutzer schickt auf der Mailadressefelder {string}")
    public void der_benutzer_schickt_auf_der_mailadressefelder(String value) {
      mail.findElementAndSendkeysFuntion("mailAdresse",value);
      String text =mail.mailAdresse.getAttribute("value");
        System.out.println(text);

    }
    @Then("Die Korrektheit der E-Mail-Adresse wird verifiziert")
    public void die_korrektheit_der_e_mail_adresse_wird_verifiziert(){

        mail.mailAdresserechnen();

    }
}
