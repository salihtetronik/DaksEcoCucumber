package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.NameOrtListHinZuPage;
import utilities.ReusableMethods;

public class NameOrtListHinZu {

    NameOrtListHinZuPage nameListPage= new NameOrtListHinZuPage();

    @Given("der benutzer fugt dem {string} einen namen und dem {string} eine mail adresse hinzu")
    public void der_benutzer_fugt_dem_einen_namen_und_dem_eine_mail_adresse_hinzu(String name, String mail) {

    // nameListPage.sendkeysMethod(nameListPage.nameOrt,text);
        nameListPage.nameOrt.sendKeys(name);
        nameListPage.mailAdresse.sendKeys(mail);
        ReusableMethods.sleep(4000);
    }
}
