# Insert Shift Array

## Challenge
Given an array, create a binary search method to find the value passed into the function.

## Approach and Efficiency
Initialize a low at 0 high at length of array minus 1 and index at 0. Set the mid point at low plus high divided by 2. Using a for loop to keep the search running, reset mid point when the mid is greater than or less than the value. When mid is the value, print the index where mid is currently located. Make a check that if the value is not in the array, return a -1 to the user. 

## Solution 
[Code](../../src/main/java/code401Challenges/BinarySearch.java)
![Whiteboard to insert shift array problem](../img/BinarySearch_whiteboard.jpg)