# Queues with Stacks

## Challenge
- Using only an 2 implementations of Stack, recreate the Queue functions through the native Stack functions. 


## Approach and Efficiency
- create a new queue class
- make instance variables of the Stack class
- create a enqueue function through Stack push/pop
- create a dequeue function through Stack push/pop

## API
- ```enqueue(data)```
  - ```push(data)```
    - pass the data from one stack to the other, to ensure it is aligned properly for queue standards.
  - ```pop()```
    - pass the data from one stack to the other, to ensure it is aligned properly for queue standards.
- ```dequeue()```
  - ```push(data)```
    - pass data between stack instances. 
  - ```pop()```
    - pass data between stack instances. 


## Big O
- ```enqueue(data)```
  - Space
    - O(1)
    - adding to stack on a queue is constant, its appending to end, back value being tracked, means you dont have to cycle through entir queue. 
  - Time
    - O(n)
    - each operation must cycle 'through' stack.
  


## Solution 
- [Code](../../src/main/java/code401Challenges/QueueWithStacks)
- [Whiteboard](../img/psuedoQueueWB.jpg)