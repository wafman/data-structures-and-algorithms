# Queues with Stacks

## Challenge
- Create an animal shelter class
- recreate enqueue for an animal object
- recreate dequeue for an animal object
  - in the dequeue, the user should have the choice to adopt an animal of their preference


## Approach and Efficiency
- create a new node class
- create a basic animal class
- create an ```enqueue()```
- create a ```dequeue()```

## API
- ```enqueue(animal type)```
  - create a function which can add an animal the the shelter in a queue
- ```dequeue(animal type)```
  - create a function where a user can adopt an animal of their choice from the queue.


## Big O
- ```enqueue(animal type)```
  - Space
    - O(1)
    - adding to stack on a queue is constant, its appending to end, back value being tracked, means you dont have to cycle through entir queue. 
  - Time
    - O(n)
    - each operation must cycle 'through' stack.
- ```dequeue(animal type)```
  - Space
    - O(1)
    - in this function, you'll be removing from the queue, so the space will get smaller.
  - Time
    - O(n)
    - in this funcion, you will have to search through the queue to find the users animal preference.
  


## Solution 
- [Code](../../src/main/java/code401Challenges/FifoAnimalShelter)
- [Whiteboard](../img/animalShelterWB.jpg)