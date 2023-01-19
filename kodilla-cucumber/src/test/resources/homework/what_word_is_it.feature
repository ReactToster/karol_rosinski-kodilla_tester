Feature: What word is it? Divisibility game

  Scenario Outline:
    Given number is <number>
    When it's divisible by 3
    Then answer is "Fizz"
    Examples:
      | number |
      | 3      |
      | 27     |
      | 99     |

  Scenario Outline:
    Given number is <number>
    When it's divisible by 5
    Then answer is "Buzz"
    Examples:
      | number |
      | 5      |
      | 25     |
      | 55     |

  Scenario Outline:
    Given number is <number>
    When it's divisible by 3 and 5
    Then answer is "FizzBuzz"
    Examples:
      | number |
      | 15     |
      | 30     |
      | 60     |

  Scenario Outline:
    Given number is <number>
    When it's not divisible by 3 or 5 or both them
    Then answer is "None"
    Examples:
      | number |
      | 1      |
      | 13     |
      | 44     |