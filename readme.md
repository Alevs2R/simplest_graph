# Simplest graph implementation in Java (30 lines)

This class `Graph ` implements simplified Graph ADT without removals
It can be used to practise in writing
Depth first search (DFT) and Breadth first search (BFT) 

List of nodes (vertices) have to be passed in constructor, 
but edges can be added later.

Only for educational purposes! :)

## Usage

### Create an instance
``` java
String[] nodes = {"A", "B", "C"};
List<String> nodesList = Arrays.asList(nodes);
Graph<String> graph = new Graph<>(nodesList);
```

### Add edges
``` java
graph.addNeighbor("A", "B");
graph.addNeighbor("A", "C");
graph.addNeighbor("C", "A");
```

### Do whatever you want
``` java
//print all nodes
for(Node<String> n: graph.getNodes()){
    System.out.println(n.element);
}

//print number of vertices that are adjacent to A
System.out.println(graph.getNode("A").neighbors.size());

//mark node as visited
graph.getNode("A").visited = true;

//maybe something like this
dfs(graph.getNodes().get(0));
```
