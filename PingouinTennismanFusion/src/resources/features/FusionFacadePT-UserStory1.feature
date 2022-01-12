@tag
Feature: US_000 Faire un match de tennis entre un pingouin et un tennisman

  Scenario Outline: Determine le gagnant du combat
    Given Un match entre un tennisman <tennisman> avec une <cote> et un pingouin <pingouin> avec une <agilite>
    When On lance le match
    Then le vainqueur <vainqueur> est designe

    Examples:
      | pingouin   | agilite   | tennisman    | cote     | vainqueur  |
      | "Bobby"    |     50    | "Djokovic"   | 1.80     | "Djokovic" |
      | "Johnson"  |     130   | "Federer"    | 1.05     | "Johnson"  |

