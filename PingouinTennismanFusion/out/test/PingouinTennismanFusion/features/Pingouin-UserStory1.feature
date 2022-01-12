@tag
Feature: US_000 Visualiser l'agilité d'un pingouin
  En tant qu'organisateur de combats de pingouins
  Je veux m'assurer que l'agilite du pingouin correspond bien a son agilite

  Scenario: Savoir l'agilité du pingouin
    Given Un pingouin
    When Recupere l'agilite
    Then Agilite renvoyee