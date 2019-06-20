# Trees
- make a node class
- make a Binary Tree class
- make a Binary Search Tree class


## Challenge
- Binary Tree
  - preOrder
  - inOrder
  - postOrder
  - breadthFirst
- Binary Search Tree
  - add
  - contains

## Approach & Efficiency
- Binary Tree
  - create a binary tree class, with traversal methods being implemented.
- Binary Search Tree
  -  create a binary search tree class. in the class, make an add function to add nodes to the tree and a contains method to check for certain values. 

## API
- Binary Tree
  - ```preOrder()```
    - traverses the tree through a Root, Left, Right method.
  - ```inOrder()```
    - traverses the tree through a Left, Root, Right method.
  - ```postOrder()```
    - traverses the tree through a Left, Right, Root method.
  - ```breadthFirst(BinaryTree binaryTree)```
    - traverses the tree level, by level. A tree with input 1-5, filling left child first would produce an out put of: 1,2,3,4,5.
  - ```maxValue(Node node)```
    - traverses tree to find the maximum value within the tree
- Binary Search Tree
  - ```add(T t)```
    - checks if the root is null, adds the value to the root if true. Else adds to the left or right child depending on the value of the root and value being inserted. Method will add value to left child if value is less than root, and to right child if value is greater than root. 
  - ```contains(T t)```
    - returns true or false of the binary search tree contains the value.

## Helping Resources
- Geeks for geeks
    - https://www.geeksforgeeks.org/binary-search-tree-data-structure/
 

## Code
[Code](../../src/main/java/code401Challenges/tree)

## Code Challenge 17 Whiteboard
[Whiteboard](../img/breadthFirstWB.jpg)

## Code Challenge 18 Whiteboard
[Whiteboard](../img/maxValWB.jpg)