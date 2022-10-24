Feature: Teilnehmer Row Loschen

  @rowLoschen
  Scenario: Der Benutzer loscht der Reihe nach Teilnehmer Row
    Given der benutzer meldet sich auf der dakswebseite an
    And der benutzer klickt auf die schaltflache „Teilnehmer“
    And der benutzer klickt auf die schaltflache richtungstaste
    Then der benutzer klickt der reihe nach auf die schaltflache tabelleRow und klickt auf den loschenButton und jaButton
