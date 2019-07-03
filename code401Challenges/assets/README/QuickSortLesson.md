# Lecture Notes: Quick Sort

In the Quick sort, you will write a function that takes in an array as a parameter as well as two more parameters, a left boundary and a right boundary. These boundaries will allow the quick sort to partition the array and sort the partitions, allowing for a quick sort. 

## Learning Objectives:
- Learn what sorting is
- learn specificially what a Quick Sort is
- learn how to code an Quick sort.

## Lecture Flow:
- Main point:
  - sorts are methods to organize data that is passed into the method. 
- Another Main Point:
  - there are many different kinds of sorts. Each has its strengths and weaknesses.
  - this particular sort will be very efficient Big O on time, if the array is already organized. If the array is not, it will take an O(n) operation to sort the array. 
    - compared to an insertion sort or merge sort, a quick sort is much faster. By partitioning the array and organizing the partitions, the sorting can occur much faster.  

## Diagram
[Whiteboard](../img/QuickSortWB.jpg)

## Algorithm
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

## PsuedoCode
```  
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
   ```

## Readings and References
- Video:
  - [HackerRank](https://www.youtube.com/watch?v=SLauY6PpjW4)
- Read:
  - [Geeks for Geeks](https://www.geeksforgeeks.org/quick-sort/)
  - [Wikipedia](https://en.wikipedia.org/wiki/Quicksort)
- Bookmark
  - [Class Lecture:](https://github.com/codefellows/seattle-java-401d4)
