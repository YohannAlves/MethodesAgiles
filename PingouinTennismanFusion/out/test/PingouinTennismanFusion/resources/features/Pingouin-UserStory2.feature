@tag
Feature: US_001 Visualiser le vainqueur d'un combat entre deux pingouins
  En tant que'organisateur de combats de pingouins
  Je veux connaitre le gagnant d'un combat entre deux pingouins

  Scenario Outline: Détermine le gagnant du combat désigné par l'arbitre
    Given Un combat entre un <pingouinUn> avec un niveau d <agiliteUn>
    And Un <pingouinDeux> avec un niveau d <agiliteDeux>
    When Le combat est lance par un arbitre
    Then Le pingouin avec la meilleure agilite est declare <vainqueur>.

    Examples:
      | pingouinUn  | agiliteUn | pingouinDeux  | agiliteDeux | vainqueur |
      | "Bobby"     |     50    | "Helios"      | 80          | "Helios"  |
      | "Johnson"   |     30    | "Derick"      | 5           | "Johnson" |