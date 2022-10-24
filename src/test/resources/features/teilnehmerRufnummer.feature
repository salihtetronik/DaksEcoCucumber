Feature: Rufnummernfelder funktionalty

  @teilnehmerrufnummernfelder
  Scenario: TC01_In die Rufnummernfelder können Zahlen und mance Zeichen eingegeben werden
    Given der benutzer meldet sich auf der dakswebseite an
    Then der benutzer klickt auf die schaltflache „Teilnehmer“
    Then der benutzer loscht in der Rufnummernfelder
    Then der benutzer schickt auf der Rufnummernfelder "*#0"
    Then der Benutzer sieht, dass den sichernsbutton aktiv ist