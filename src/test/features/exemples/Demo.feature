
@test
Feature: Authentification
en tant que administrateur je dois avoir un mail et un mot de passe valide

  @testcaspassant
  Scenario: Authentification valide
    Given ouvrir navigateur chrome
    And saisir url
    When saisir mail
    And saisir password
    And cliquer sur connecter
    Then  verifier page dacceuil 
    

 