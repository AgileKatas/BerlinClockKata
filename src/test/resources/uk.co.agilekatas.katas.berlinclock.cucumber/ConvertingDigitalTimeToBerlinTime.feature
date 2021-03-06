Feature: Converting Digital Time to Berlin Time
  So what we want first is a way to get a textual representation of a Berlin Clock time based on a digital time.
  This is so we can use this converter everywhere, all we have to do is hook up a frontend.
  We're going to be going over the clock row by row to make things clearer and ensure we get everything right first time.

  Scenario Outline: Implement the Single Minutes Row
    Given I have started the converter
    When I enter <time>
    Then <row> is returned for the single minutes row

  Examples:
    | time     | row  |
    | 00:00:00 | OOOO |
    | 23:59:59 | YYYY |
    | 12:32:00 | YYOO |
    | 12:34:00 | YYYY |
    | 12:35:00 | OOOO |

  Scenario Outline: Implement the Five Minutes Row
    Given I have started the converter
    When I enter <time>
    Then <row> is returned for the five minutes row

  Examples:
    | time     | row         |
    | 00:00:00 | OOOOOOOOOOO |
    | 23:59:59 | YYRYYRYYRYY |
    | 12:04:00 | OOOOOOOOOOO |
    | 12:23:00 | YYRYOOOOOOO |
    | 12:35:00 | YYRYYRYOOOO |

  Scenario Outline: Implement the Single Hours Row
    Given I have started the converter
    When I enter <time>
    Then <row> is returned for the single hours row

  Examples:
    | time     | row  |
    | 00:00:00 | OOOO |
    | 23:59:59 | RRRO |
    | 02:04:00 | RROO |
    | 08:23:00 | RRRO |
    | 14:35:00 | RRRR |


  Scenario Outline: Implement the Five Hours Row
    Given I have started the converter
    When I enter <time>
    Then <row> is returned for the five hours row

  Examples:
    | time     | row  |
    | 00:00:00 | OOOO |
    | 23:59:59 | RRRR |
    | 02:04:00 | OOOO |
    | 08:23:00 | ROOO |
    | 16:35:00 | RRRO |


  Scenario Outline: Implement the Seconds Lamp
    Given I have started the converter
    When I enter <time>
    Then <lamp> is returned for the seconds lamp

  Examples:
    | time     | lamp |
    | 00:00:00 | Y    |
    | 23:59:59 | O    |


  Scenario Outline: Integrate the Entire Berlin Clock
    Given I have started the converter
    When I enter <time>
    Then <clock> is returned

  Examples:
    | time     | clock                    |
    | 00:00:00 | YOOOOOOOOOOOOOOOOOOOOOOO |
    | 23:59:59 | ORRRRRRROYYRYYRYYRYYYYYY |
    | 16:50:06 | YRRROROOOYYRYYRYYRYOOOOO |
    | 11:37:01 | ORROOROOOYYRYYRYOOOOYYOO |

