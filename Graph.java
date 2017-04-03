import java.util.*;

class Node<V> {
    boolean visited = false;
    V element;
    List<Node<V>> neighbors = new LinkedList<>();
    Node(V v){
        element = v;
    }
    void addNeighbor(Node<V> v){
        neighbors.add(v);
    }
}

class Graph<V> {
    private Map<V, Node<V>> adj;
    Graph(List<V> nodes) {
        adj = new HashMap<>();
        for (V node : nodes) {
            adj.put(node, new Node<V>(node));
        }
    }
    Node<V> getNode(V node){
        return adj.get(node);
    }
    void addNeighbor(V v1, V v2) {
        adj.get(v1).addNeighbor(getNode(v2));
    }
    Collection<Node<V>> getNodes(){
        return adj.values();
    }
}