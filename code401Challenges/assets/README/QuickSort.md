# Quick Sort
- Given an array of integers, a left boundary and a right boundary, sort the array.  


## Challenge
- check that array is not empty
- check the left and right boundaries are not outside of the array.
- sort the array

## Approach & Efficiency
- check that array is not empty, if so throw error
- check the boundaries to make sure they're not outside the array boundaries.
- check if left is less than right if so:
  - define an int variable holding value of partition method.
  - recursively call quicksort with right side - 1
  - recursively call quicksort with left side plust 1
- partition method
  - define int variable called pivot with value of array and index right
  - define int variable called low with value of left - 1
  - for loop through from left to right, incrementing i
    - check if array at index i is less than or equal to pivot
      - increment low
      - call swap with values arr, i and low passed as arguments
  - call swap with values arr, right and low plus 1 as arguments
  - return low plus 1
- swap method
  - define temp variable with value of array at index i
  - change value of array at index i to value of array at index low
  - change value of array at index low to value of temp variable

## API
- ```quickSort(int[] arr, int left, int right)```
  - takes an array of integers, an int left and an int right, using the left and right as bounds to partition the array for quicker sorting. 


## Helping Resources
- Geeks for geeks
  -https://www.geeksforgeeks.org/quick-sort/
- Wikipedia
  - https://en.wikipedia.org/wiki/Quicksort#Space_complexity
 

## Code
[Code](../../src/main/java/code401Challenges/QuickSort.java)

## Whiteboard
[Whiteboard](../img/QuickSortWB.jpg)

## Lecture
- [Code Challenge 26: Insertion Sort Lecture](./QuickSortLesson.md)