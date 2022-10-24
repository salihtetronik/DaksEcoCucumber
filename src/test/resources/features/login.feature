Feature: Login Functionality

  @Smoke
  Scenario: Melden Sie sich mit gültigem Benutzernamen und Passwort an
    Given Navigieren Sie zur tetronikwebseite
    And der Benutzer gibt Benutzernamen und Passwort ein
    And der benutzer klickt auf die Anmeldescaltflache
    Then Der Benutzer sollte sich erfolgreich anmelden
