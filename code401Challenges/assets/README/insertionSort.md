# Insertion Sort
- Given an array of integers, sort the array in ascending order.  


## Challenge
- check that array is not empty
- sort the array

## Approach & Efficiency
- check that array is not empty, if so throw error
- start a for loop with i at 1 and going to the end of the array.
- inside the for loop, initialize two new variables, one to hold the current value, one to act as the advancing variable.
- inside the while loop, check that the advancing variable is greater than zero, and also that the current value is less than arr value at idex of advancing variable (arr[<advancing variable>])

## API
- ```insertionSort(int[] arr)```
  - takes an array of integers and sorts them into ascending order. 


## Helping Resources
- Geeks for geeks
  - https://www.geeksforgeeks.org/insertion-sort/
- Javapoint
  - https://www.javatpoint.com/insertion-sort-in-java
 

## Code
[Code](../../src/main/java/code401Challenges/InsertionSort.java)

## Whiteboard
[Whiteboard](../img/InsertionSortWB.jpg)

## Lecture
- [Code Challenge 26: Insertion Sort Lecture](./InsertionSortLecture.md)