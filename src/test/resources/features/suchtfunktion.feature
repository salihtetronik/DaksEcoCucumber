Feature: Suchfunktion


  @suchtfunktion
  Scenario: Der Benutzer sucht eine Information des teilnehmer in der Oberflache
    Given der benutzer meldet sich auf der dakswebseite an
    And der benutzer klickt auf die schaltflache „Teilnehmer“
    And der benutzer doubleklickt auf die schaltflache tabellerow
    Then der benutzer sucht eine information des teilnehmer
