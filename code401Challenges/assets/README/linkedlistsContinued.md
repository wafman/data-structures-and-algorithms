# Insert Shift Array

## Challenge
- Create Node and Linked List Classes
- insert function to insert value into linked lists
- includes function to check linked list for a particular value
- print function to print all values in linked list

## Approach and Efficiency
Create a package called linkedlist. Within package create separate node and linked lists classes. Within the node class, instantiate the node with what type of data will be its possible values. Within the linked lists class, instantiate an empty list. Write all functions within the linked list class. 

## API
- ```append(int data)```
  - allows you to insert a value to the end of the linked list
- ```insertBefore(int target, int value)```
  - allows you to insert a value into the linked list before the provided target.
- ```insertAfter(int target, int value)```
  - allows you to insert a value into the linked list after the provided target.

## Big O
- ```append(int data)```
  - O(n)
  - has to cycle through entire linked list to insert
- ```insertBefore(int target, int value)```
  - O(n)
  - has to cycle through entire linked list up to target in order to insert
- ```insertAfter(int target, int value)```
  - O(n)
  - has to cycle through entire linked list up to target to insert

## Solution 
- [Code](../../src/main/java/code401Challenges/linkedlist)
- [Whiteboard](../img/linkedListWhiteboard.jpg)
