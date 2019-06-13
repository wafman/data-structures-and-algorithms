# Bracket Validation

## Challenge
- recieve string and ensure that any bracket that is opened is closed properly.


## Approach and Efficiency
- import Stack class
- loop through string input
- compare string char to opening bracket
- push bracket into stack
- compare string char to closing bracket
  - pop stack to check for opening bracket
  - return false if no match
- check if stack is null at end
  - if null return true, else return false
  - stack should be null if brackets are matched

## API
- ```bracketValidation(String input)```
  - recieve string, loop through it one char at a time.
  - return true if brackets are matched properly
  - return false if they are not


## Big O
- ```bracketValidation(String input)```
  - Space
    - O(n)
    - creating a stack of matched opening brackets
  - Time
    - O(n)
    - looping through input one char at a time, while checking stack one node at a time.
  


## Solution 
- [Code](../../src/main/java/code401Challenges/MultiBracketValidation)
- [Whiteboard](../img/bracketValidationWB.jpg)