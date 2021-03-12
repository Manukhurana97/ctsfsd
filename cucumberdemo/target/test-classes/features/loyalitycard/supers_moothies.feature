Feature: Super Smoothie Loyalty Card Program

  The more smoothie you bye, the more you earn

  Background:
    Given  the Following drink categories:
      | Drink              | Category | Points |
      | Banana             | Regular  | 15     |
      | Triple Berry Blend | Fancy    | 20     |
      | Lemon Tea          | Tea      | 10     |


  Scenario Outline: Earning points when purchasing smoothies
    Given Michael is a Morning Freshness Member
    When Michael purchases <Quality> <Drink> drinks
    Then he should earn <Points> points
    Examples:
      | Drink              | Quality | Points |
      | Banana             | 1       | 15     |
      | Triple Berry Blend | 1       | 20     |
      | Lemon Tea          | 1       | 10     |

