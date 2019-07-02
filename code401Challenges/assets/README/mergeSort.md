# Merge Sort
- Given an array of integers, split the array in two and sort each subarray in ascending order.  


## Challenge
- check that array is not empty
- split the array into subarrays
- sort the subarrays

## Approach & Efficiency
- check that array is not empty, if so throw error
- initialize a variable with the main array length
- inside conditional array length check, initialize a mid point variable
- initialize two subarrays, and populate the subarrays with the values of the array from the mid.
  - first subarray will take the values of the main array up to mid
  - second subarray will take the values from the mid to the end of the array.
- write a helper function to handle merging the arrays back together
  - inside helper function, check if a subarray has reached the end of it's length, then add the other array. While merging the arrays, check which value is greater to overwrite the main array with that value.

## API
- ```mergeSort(int[] arr)```
  - takes an array of integers and splits it into subarray, then sorts them into ascending order while merging back into one array.


## Helping Resources
- Geeks for geeks
  -https://www.geeksforgeeks.org/merge-sort/
- Tutorials Point
  - https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm
 

## Code
[Code](../../src/main/java/code401Challenges/MergeSort.java)

## Whiteboard
[Whiteboard](../img/MergeSortWB.jpg)

## Lecture
- [Code Challenge 26: Insertion Sort Lecture](./MergeSortLecture.md)