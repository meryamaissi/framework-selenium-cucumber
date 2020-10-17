@tag
Feature: Authentification - Param - OrangeHRM
  En tant que utilisateur je souhaite m authentifier

  Background: 
    Given Je ouvre l application OrangeHRM
    When Je saisie le nom de l utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Home

  @buzz
  Scenario: clique - BUZZ
    When Je clique sur le module Buzz

  @temps
  Scenario: clique - temps
    When Je clique sur le module Temp