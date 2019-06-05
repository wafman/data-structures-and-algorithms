# Return Nth from end

## Challenge
- iterate through linked list and return nth number from the end of the linked list.


## Approach and Efficiency
- make a counter variable to count the number of nodes
- while loop through linked list while node next != null, increment counter each node
- for loop through linked list while i less than counter - n - 1
  - minus 1 because we don't want the null value

## API
- ```returnNFromEnd(int n)```
  - allows you to insert a value to the end of the linked list


## Big O
- ```returnNFromEnd(int n)```
  - O(n)
  - has to cycle through entire linked list to insert
  - has to loop again, but has obtained value looking for. dependent on value looking for. constant.


## Solution 
- [Code](../../src/main/java/code401Challenges/linkedlist)
- [Whiteboard](../img/)