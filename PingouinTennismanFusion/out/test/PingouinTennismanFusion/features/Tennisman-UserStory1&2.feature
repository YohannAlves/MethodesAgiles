Feature: US_000
  En tant qu'utilisateur
  Je veux calculer les chances de gagner de mon Tennisman
  Afin de savoir si il est performant
  Scenario: calcul de chances
    Given un tennisman
    When l'utilisateur calcule les chances de son tennisman
    Then les chances sont calculées et retournées

  Scenario Outline: désignation du vainqueur d'un match
    Given un tennisman classé <classement>
    And un autreTennisman classé <autreClassement>
    And un match
    When l'utilisateur joue un match avec ses tennisman
    Then le vainqueur est désigné
    Examples:
      | classement | autreClassement |
      | 2          | 1               |
