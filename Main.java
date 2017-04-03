import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] nodes = {"A", "B", "C"};
        List<String> nodesList = Arrays.asList(nodes);
        Graph<String> graph = new Graph<>(nodesList);

        graph.addNeighbor("A", "B");
        graph.addNeighbor("A", "C");

        System.out.println(graph.getNode("A").neighbors.size());
        graph.getNode("A").visited = true;
    }
}
