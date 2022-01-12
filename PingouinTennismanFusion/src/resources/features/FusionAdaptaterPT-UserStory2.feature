@tag
Feature: US_000 Faire arbitrer un match de tennis

  Scenario Outline: L'arbitre designe le vainqueur
    Given Un match entre deux tennisman <nom1> <nom2> de  <cote1> et <cote2>
    When L'arbitre organise le match
    Then l'arbitre designe le vainqueur <vainqueur>

    Examples:
      |nom1       | cote1      | nom2    |cote2    | vainqueur    |
      |"Djokovic" | 1.30       | "Nadal" |1.60     | "Nadal"      |
      |"Gasquet"  | 1.20       | "Tsonga"|1.10     | "Gasquet"    |



