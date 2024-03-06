
@tag
Feature: creation compte facebook 



  @tag1
  Scenario: creation compte facebook valide 
    Given ouvrir le navigateur chrome
    And entrer url "https://www.facebook.com/?locale=fr_FR"
    When cliquer sur creation de compte
    And remplir prenom "khouloud"
    And remplir nom "hedhli"
    And remplir email "khouloudhedhli@gmail.com"
    And remplir email confirmation "khouloudhedhli@gmail.com"
    And remplir mot de passe "123456"
    And remplir jour de naissance "6"
    And remplir mois de naissance "5"
    And remplir annee de naissance "1991"
    And remplir genre "femme"
    And cliquer sur s inscrire 
    Then verifier l inscription  
    

  

