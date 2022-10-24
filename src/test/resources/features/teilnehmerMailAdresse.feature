Feature: Mail Adresse Funktionalty

  @mailAdresse
  Scenario:Prüfung, ob der Kunde eine gültige E-Mail-Adresse hat
    Given der benutzer meldet sich auf der dakswebseite an
    And der benutzer klickt auf die schaltflache „Teilnehmer“
    And der benutzer kilckt auf den Neu Button
    And der benutzer loscht in der Mailadressefelder
    And der benutzer schickt auf der Mailadressefelder "salihh@gmail.com"
    Then Die Korrektheit der E-Mail-Adresse wird verifiziert