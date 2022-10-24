package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TeilnehmerRowLoschenPage;
import utilities.ReusableMethods;

public class TeilnehmerRowLoschen {

    TeilnehmerRowLoschenPage rowLochen=new TeilnehmerRowLoschenPage();

    @Given("der benutzer klickt auf die schaltflache richtungstaste")
    public void der_benutzer_klickt_auf_die_schaltflache_richtungstaste() {
        ReusableMethods.sleep(4000);
        rowLochen.clickElementMethod("richtungstaste5");
    }
    @Then("der benutzer klickt der reihe nach auf die schaltflache tabelleRow und klickt auf den loschenButton und jaButton")
    public void der_benutzer_klickt_der_reihe_nach_auf_die_schaltflache_tabelle_row_und_klickt_auf_den_loschen_button_und_ja_button() {

       rowLochen.loschenMethod();
    }

}
