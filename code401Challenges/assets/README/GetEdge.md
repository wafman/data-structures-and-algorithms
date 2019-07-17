# Get Edge
- Determine if a direct path is possible and the cost.

## Challenge
- Given an array of cities and a graph, determine if a direct flight is possible between the cities and what the cost will be. 

## Approach & Efficiency
- loop through the entire array
- while loop inside the for loop, checking if hashmap of neighbors contains the item, so long as true, continue looping through.
- each true iteration, add the cost to the total cost.
- if false, return false and a $0 cost.

## API
- ```directFlights(String[] arr, Graph graph)```
  - accepts a String array and a graph, search through the graph starting at the beggining of the array and determine if direct flights are possible between the indexes. 

## Helping Resources
- BaeluDung
  - https://www.baeldung.com/java-graphs
- Youtube
  - https://www.youtube.com/watch?v=fjT3WDKiAkI
  - https://www.youtube.com/watch?v=gXgEDyodOJU
  - https://www.youtube.com/watch?v=zaBhtODEL0w&t=347s

## Code
[Code](../../src/main/java/code401Challenges/GetEdge/GetEdge.java)


## Whiteboard
-![Get Edge](../img/GetEdgeWB.jpg)





