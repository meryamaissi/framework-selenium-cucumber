@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m authentifier

  @cnx
  Scenario: Authentification - OrangeHRM
    Given Je ouvre l application OrangeHRM
    When Je saisie le userName
    And Je saisie le mot de passe
    And Je clique sur le bouton Login
    Then Redirection vers la page Home
