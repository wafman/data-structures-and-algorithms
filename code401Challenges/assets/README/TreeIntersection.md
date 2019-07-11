# Tree Intersection
- taking two trees as arguments, find the common values between the two. 


## Challenge
- utilizing hasset, find the commone values between the two trees.

## Approach & Efficiency
- tree intersection
  - create sets on each tree
  - add all values in the tree into the hashset using a traversal method.
  - compare the sets, returning a list of values contained in each tree.

## API
- ```treeIntersection(BinaryTree<Integer> treeA, BinaryTree<Integer> treeB)```
  - find the common values between the two trees.


## Helping Resources
- StackOverflow
  - https://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
- Java Docs
  - https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
- Geeks for geeks
  - https://www.geeksforgeeks.org/hashset-retainall-method-in-java-with-example/

## Code
[Code](../../src/main/java/code401Challenges/TreeIntersection/TreeIntersection.java)


## Whiteboard
[Whiteboard](../img/TreeIntersectionWB.jpg)

