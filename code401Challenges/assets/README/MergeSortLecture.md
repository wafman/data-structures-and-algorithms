# Lecture Notes: Merge Sort

In the merge sort, you will write a function that takes in an array as a parameter and splits that array into subarrays. Those subarrays are then sorted into numerical ascending order. 

## Learning Objectives:
- Learn what sorting is
- learn specificially what a merge Sort is
- learn how to code an merge sort.

## Lecture Flow:
- Main point:
  - sorts are methods to organize data that is passed into the method. 
- Another Main Point:
  - there are many different kinds of sorts. Each has its strengths and weaknesses.
  - this particular sort will be very efficient Big O on time, if the array is already organized. If the array is not, it will take an O(n) operation to sort the array. 
    - compared to an insertion sort, a merge sort much faster. By splitting the array into subarrays and then recursively calling on the sort method, you can reduce the total time spent sorting the array. 
  - Merge sort is mainly useful when sorting linked lists.  

## Diagram
[Whiteboard](../img/MergeSortWB.jpg)

## Algorithm
- check that array is not empty, if so throw error
- initialize a variable with the main array length
- inside conditional array length check, initialize a mid point variable
- initialize two subarrays, and populate the subarrays with the values of the array from the mid.
  - first subarray will take the values of the main array up to mid
  - second subarray will take the values from the mid to the end of the array.
- write a helper function to handle merging the arrays back together
  - inside helper function, check if a subarray has reached the end of it's length, then add the other array. While merging the arrays, check which value is greater to overwrite the main array with that value.

## PsuedoCode
```  
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if arr.length > 1
      DECLARE mid <-- n/2
      DECLARE b <-- arr[0...mid]
      DECLARE c <-- arr[mid...n]
      // break down the left side
      Mergesort(b)
      // break down the right side
      Mergesort(c)
      // merge the left and the right side together
      Merge(b, c, arr)

ALGORITHM Merge(b, c, a)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < b && j < c
        if b[i] <= c[j]
            a[k] <-- b[i]
            i <-- i + 1
        else
            a[k] = c[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = b.length
       add remaining items in array c to array a
    else
       add remaining items in array b to array a
       
    return a
   ```

## Readings and References
- Video:
  - [Joe James](https://www.youtube.com/watch?v=iMT7gTPpaqw)
- Read:
  - [Geeks for Geeks](https://www.geeksforgeeks.org/merge-sort/)
  - [Baeldung](https://www.baeldung.com/java-merge-sort)
- Bookmark
  - [Class Lecture:](https://github.com/codefellows/seattle-java-401d4)
