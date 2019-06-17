# Trees
- make a node class
- make a Binary Tree class
- make a Binary Search Tree class


## Challenge
- Binary Tree
  - preOrder
  - inOrder
  - postOrder
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
- Binary Search Tree
  - ```add(T t)```
    - checks if the root is null, adds the value to the root if true. Else adds to the left or right child depending on the value of the root and value being inserted. Method will add value to left child if value is less than root, and to right child if value is greater than root. 
  - ```contains(T t)```
    - returns true or false of the binary search tree contains the value. 
 

## Code
[Code](../../src/main/java/code401Challenges/tree)