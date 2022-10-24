Feature: Name mit scenario outline


  Background:
    Given der benutzer meldet sich auf der dakswebseite an
    And der benutzer klickt auf die schaltflache „Teilnehmer“
    And der benutzer kilckt auf den Neu Button
@smokeTest
    Scenario Outline: Name fugt mit scenario outline hinzu
      Given der benutzer fugt dem "<NameOrtfelder>" einen namen und dem "<MailAdressefelder>" eine mail adresse hinzu
      Then der benutzer klickt auf den sichernsbutton und sieht den Neu Button



      Examples:
      |NameOrtfelder| MailAdressefelder|
      |ay           | ay@gmail.com     |
      |agac         | agc@hotmail.com  |
      |badem        | bdm@tetronik.com |
      |fistik       | fstk@tetronik.com|
      |cicek        | cck@gmail.com    |