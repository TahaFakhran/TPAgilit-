Feature: Champion Leveling

  The goal of this game is to have multiple champions that can fight against each others,
  and in able to make this happen not only we want to create the champions but also give
  them levels to make the fights more interesting.

  Scenario: Create a Champion with a specific level
    Given a champion with name "Garen" and level 5
    When the champion is created
    Then the champion should have name "Garen"
    And the champion should have level 5

  Example:
  | Champion | Name  | Level |
  | champion1 | Garen | 5     |

  Scenario: Level up the Champion
    Given a champion with name "Darius" and level 3
    When the champion levels up
    Then the champion should have level 4

  Example:
  | Champion | Name   | Level |
  | champion1 | Darius | 4     |

  Scenario: Ensure the minimum level is 1
    Given a champion with name "Teemo" and level 0
    When the champion is created
    Then the champion should have level 1

  Example:
  | Champion | Name  | Level |
  | champion1 | Teemo | 1     |

  Scenario: Set the Champion's level
    Given a champion with name "Jinx" and level 2
    When the champion's level is set to 8
    Then the champion should have level 8

  Example:
  | Champion | Name | Level |
  | champion1 | Jinx | 8     |
