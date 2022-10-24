package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TeilnehmerMitExcelPage;

public class TeilnehmerMitExcel {
    @Given("der benutzer fugt teilnehmerList mit excel hinzu")
    public void derBenutzerFugtTeilnehmerListMitExcelHinzu() {

        TeilnehmerMitExcelPage teilnehmer= new TeilnehmerMitExcelPage();
        teilnehmer.teilnehmerListHinZufugen();


    }
}
