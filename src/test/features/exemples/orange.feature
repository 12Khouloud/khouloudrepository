@tag
Feature: authentification page orange

  @tag1
  Scenario Outline: authentification cas passant et cas non passant
    Given ouvrir chrome
    And ouvrir URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir "<user>" dans le login
    And saisir "<mot de passe>" dans le mot de passe
    And taper sur le bouton login
    Then verifier le resultat obtenu "<resultat>"

    Examples: 
      | user     | mot de passe | resultat              |
      | Admin    | admin123     | BMikeMike Tester |
      | Admin    |        aze5  | Invalid credentials   |
      | azerty   | admin123     | Invalid credentials   |
