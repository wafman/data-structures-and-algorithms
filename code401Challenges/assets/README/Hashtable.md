# HashTable
- implement a hash table 


## Challenge
- complete a hash method
- complete an add method
- complete a get method
- complete a contains method

## Approach & Efficiency
- hash
  - should convert the string into ascii values, add the values together and multiply that by a prime number.
  - take that number and modulo against the size of the hashtable
- add
  - hash the key to be added, if there's no node at that index, insert the key/value pair there.
  - if there is a node there, created a linked list of the nodes.
- get
  - hash the key that you want to retrieve the value of.
  - go to that index in the hashtable, if the node key matches the key passed in, return that value, otherwise proceed down the linked list checking each node key against the passed in key. when the correct node key is found, return that node value.
- contains
  - hash the key passed in.
  - if there is no node at that index in the hashmap, return false.
  - if the node at that index matches the key passed in, return true.
  - if there is a linked list present, search the linked list until the correct node key is found and return true.
  - return false at end in case the search does not return true.

## API
- ```hash(String key)```
  - hashes the key into a number to represent the index where a node can be inserted or found.
- ```add(String key, String value)```
  - uses the hash to find where to insert a new node with the key and value passed in.
- ```get(String key)```
  - uses the hash to find the key in the hashmap and return the value of the key.
- ```contains(String key)```
  - uses the hash to find the key in the hashmap and return true if it is in the hashmap and false if it is not.


## Helping Resources
- Geeks for geeks
  - https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

## Code
[Code](../../src/main/java/code401Challenges/hashtable/Hashtable.java)

