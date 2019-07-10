# Repeated Word
- check if a word in a sentence is repeated within that sentence.


## Challenge
- utilizing hasmap, find the first repeated word in a sentence.

## Approach & Efficiency
- repeated word
  - split input sentence on spaces
  - create temp string variable
  - for loop through the new array of words an input into the hashmap
  - on first collision, return the repeated word.

## API
- ```repeatedWord(String sentence)```
  - find the first repeated word and return that word, otherwise enter each word into the hashmap.


## Helping Resources
- StackOverflow
  - https://stackoverflow.com/questions/12506655/how-can-i-remove-all-leading-and-trailing-punctuation

## Code
[Code](../../src/main/java/code401Challenges/hashtable/RepeatedWord.java)


## Whiteboard
[Whiteboard](../img/RepeatWordWB.jpeg)

