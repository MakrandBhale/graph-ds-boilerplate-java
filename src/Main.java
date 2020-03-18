public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph g = new Graph();
        Vertex a = g.createVertex("a");
        Vertex b = g.createVertex("b");
        Vertex c = g.createVertex("c");

        g.addEdge(b, a, 5, true);
        g.addEdge(b, c, 3);
        g.addEdge(c, a, 4);
        g.printNeighbours(a);
    }
}
