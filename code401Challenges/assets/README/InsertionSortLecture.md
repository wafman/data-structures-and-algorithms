# Lecture Notes: Insertion Sort

In the insertion sort, you will write a function that takes in an array as a parameter and sorts that array into numerical ascending order. 

## Learning Objectives:
- Learn what sorting is
- learn specificially what a Insertion Sort is
- learn how to code an insertion sort.

## Lecture Flow:
- Main point:
  - sorts are methods to organize data that is passed into the method. 
- Another Main Point:
  - there are many different kinds of sorts. Each has its strengths and weaknesses.
  - this particular sort will be very efficient Big O on time, if the array is already organized. If the array is not, it will take an O(n) operation to sort the array. 
  - Insertion sort is mainly used when the size of the array is small. It can be very useful if the array is "almost" organized. 

## Diagram
[Whiteboard](../img/InsertionSortWB.jpg)

## Algorithm
- check that array is not empty, if so throw error
- start a for loop with i at 1 and going to the end of the array.
- inside the for loop, initialize two new variables, one to hold the current value, one to act as the advancing variable.
- inside the while loop, check that the advancing variable is greater than zero, and also that the current value is less than arr value at idex of advancing variable (arr[<advancing variable>])

## PsuedoCode
```  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
   ```

## Readings and References
- Video:
  - [Geeks for Geeks](https://www.youtube.com/watch?v=OGzPmgsI-pQ)
- Read:
  - [Geeks for Geeks](https://www.geeksforgeeks.org/insertion-sort/)
  - [Java Point](https://www.javatpoint.com/insertion-sort-in-java)
- Bookmark
  - [Class Lecture:](https://github.com/codefellows/seattle-java-401d4)
