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

