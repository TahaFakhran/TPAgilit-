Feature: Champion Abilities

  The goal is to define and use abilities for champions in the game.

  Scenario: Cast Passive Ability without Level Up
    Given a champion with name "Ashe" and level 2 with abilities "Frost Shot", "Ranger's Focus", "Volley", "Hawkshot", and "Enchanted Crystal Arrow"
    When the champion casts ability "passive"
    Then the champion should not level up
    And the champion's active ability should be "Frost Shot"

  Example:
  | Champion   | Name  | Level | Passive      | AbilityQ       | AbilityW  | AbilityE  | AbilityR                |
  | champion1  | Ashe  | 2     | Frost Shot   | Ranger's Focus | Volley    | Hawkshot  | Enchanted Crystal Arrow|

  Scenario: Cast AbilityQ and Level Up
    Given a champion with name "Yasuo" and level 4 with abilities "Way of the Wanderer", "Steel Tempest", "Wind Wall", "Sweeping Blade", and "Last Breath"
    When the champion casts ability "Q"
    Then the champion should level up
    And the champion's active ability should be "Steel Tempest"

  Example:
  | Champion   | Name  | Level | Passive           | AbilityQ       | AbilityW  | AbilityE         | AbilityR      |
  | champion1  | Yasuo | 5     | Way of the Wanderer | Steel Tempest | Wind Wall  | Sweeping Blade | Last Breath   |

