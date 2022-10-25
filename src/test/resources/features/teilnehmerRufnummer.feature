Feature: Rufnummernfelder funktionalty

  @teilnehmerrufnummernfelder
  Scenario: TC01_In die Rufnummernfelder können Zahlen und manche Zeichen eingegeben werden
    Given der benutzer meldet sich auf der dakswebseite an
    Then der benutzer klickt auf die schaltflache „Teilnehmer“
    Then der benutzer kilckt auf den Neu Button
    Then der benutzer loscht in der Rufnummernfelder
    Then der benutzer schickt auf der Rufnummernfelder "*#019%"
    Then der Benutzer sieht, dass den sichernsbutton aktiv ist