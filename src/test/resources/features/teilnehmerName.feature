#noinspection SpellCheckingInspection
Feature: Teilnehmer abspeichern

# Senaryolarda ayni olan ilk kisimlar Background olarak yazilabilir
Background:
  Given der benutzer meldet sich auf der dakswebseite an
  And der benutzer klickt auf die schaltflache „Teilnehmer“
  And der benutzer kilckt auf den Neu Button

  @teilnehmernameabspeichern
  Scenario: TC01_Die Administerten Daten können abspeichern

  And der benutzer fugt einen neuen Teilnehmer hinzu
    Then der benutzer klickt auf den sichernsbutton und sieht den Neu Button

@Regression
  Scenario: TC02_Die Langenbegrenzeungen wurden gemessen

    And der benutzer klickt auf die schaltflache „Teilnehmer“
    And der benutzer gibt einen namen mit mehr als 30 Zeichen in das namensfeld ein
    Then der benutzer klickt auf den sichernsbutton und sieht den Neu Button
