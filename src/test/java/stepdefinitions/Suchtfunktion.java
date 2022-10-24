package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SuchtfunktionPage;
import utilities.ReusableMethods;

public class Suchtfunktion {

    SuchtfunktionPage suchtPage = new SuchtfunktionPage();


    @Given("der benutzer doubleklickt auf die schaltflache tabellerow")
    public void der_benutzer_doubleklickt_auf_die_schaltflache_tabellerow() {

        suchtPage.doubleClickTabelleRow();
    }

    @Then("der benutzer sucht eine information des teilnehmer")
    public void der_benutzer_sucht_eine_information_des_teilnehmer() {

        suchtPage.suchfunktionMethod();
    }

}
