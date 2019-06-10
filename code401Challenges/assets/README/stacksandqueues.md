# Stacks and Queues
- make a node class
- make a stack class
- make a queue class


## Challenge
- stack
  - push
    - add a value to the top of the stack
  - pop
    - remove the top value
  - peek
    - retrieve the value of the top node
- queue
  - enqueue
    - add a value to the end of the queue
  - dequeue
    - remove a value from front of queue
  - peek
    - retrieve a value from the front of queue

## Approach & Efficiency
- Stack
  - my approach was to build upon work from the Linked Lists labs.
  - Big O for stack is constant, you're always adding or removing from the front. you never have to cycle through the entire stack.
- Queue
  - big O for the queue is constant.
    - when adding to the queue, it is always to the back, but my queue class is tracking the last and adding the new node as the next of the last and reassigning last to the new node.
    - when removing from the front of the queue, it never has to cycle through the queue. 

## API
- Stack
  - ```push(int value)```
    - inserts the value provided onto the top of the stack, becoming the new top value, and pushing the previous top to become it's next.
  - ```pop()```
    - removes the top node
  - ```peek()```
    - retrieves the value of the top node.
- Queue 
  - ```enqueue(int data)```
    - inserts the data provided to the back of the queue. it does this through the queue tracking what the last node is and appending the data to be the next of the last, thus becoming the new last node in the queue.
  - ```dequeue()```
    - removes the last node from the queue.
  - ```peek()```
    - retrieves the value from the front node. 

## Code
[Code](../../src/main/java/code401Challenges/stacksandqueues)