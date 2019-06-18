# Fizz Tree
- Take a tree and replace the input with Fizz, Buzz, or FizzBuzz. 


## Challenge
- search the input tree
- check node values for target values to replace with Fizz, Buzz, or FizzBuzz.

## Approach & Efficiency
- main function serves as the holder function to call the other functions.
- I used two helper functions in this problem. The first does the actual "search" and recursively calls itself to check the left child then right child nodes.
- another helper function does the actual conditional check and replacement. 

## API
- Binary Tree
  - ```fizzBuzzTree(BinaryTree binaryTree)```
    - checks if tree is null, returns tree if so. otherwise calls the fizzSearch function passing the tree root. responsible for returning the tree after changes are made. 
  - ```fizzSearch(Node node)```
    - checks if node is null, if not, calls the makeTheFizz where the mod conditional checks and replacements occur.
    - recursively calls itself to check left child and right child.
  - ```makeTheFizz(Node node)```
    - conditional checks for modulo operations
    - if node is mod 3 and 5, replaces node value with FizzBuzz
    - if node is mod 3, replaces node value with Fizz
    - if node is mod 5, replaces node value with Buzz. 


## Helping Resources
- Geeks for geeks
    - https://www.geeksforgeeks.org/binary-search-tree-data-structure/
 

## Code
[Code](../../src/main/java/code401Challenges/FizzBuzzTree)

## Whiteboard
[Whiteboard](../img/fizzTreeWB.jpg)