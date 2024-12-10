Feature: Is it FizzBuzz?

  Scenario Outline: The given number is dividable by 3, 5, both or none
    Given the number is <number>
    When I ask wheter number is dividable by 3, 5, both or none
    Then Result should be <answer>
    Examples:
      | number | answer |
      | 2 | "None" |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 8 | "None" |
      | 30 | "FizzBuzz" |
      | 20 | "Buzz" |
      | 9 | "Fizz" |
      | 60 | "FizzBuzz" |