Feature: Post functionality

  Scenario Outline: A a user i want to create a new post
    Given i have create new post
    And I send a post to be create with id <id>,title <title>, and content <content>
    Then I should be able to see my newly created post

    Examples:
      | id | title    | content |
      | 15 | new post | hello   |