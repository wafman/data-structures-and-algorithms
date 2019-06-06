# Merge Linked Lists

## Challenge
- Take two merged lists, zipper the second list into the first list and return a merged linked list.


## Approach and Efficiency
- create variables to hold current nodes for each list
- create variables to hold next nodes for each list
- point next list 1 to next list 2.
- point current list 1 to current list 2.

## API
- ```mergeLinkedLists(LinkedList list1, LinkedList list2)```
  - allows you to take two linked lists and merge them


## Big O
- ```mergeLinkedLists(LinkedList list1, LinkedList list2)```
  - O(n)
  - has to cycle through entire of both linked lists to insert
  


## Solution 
- [Code](../../src/main/java/code401Challenges/linkedlist)
- [Whiteboard](../img/mergedListsWhiteboard.jpg)