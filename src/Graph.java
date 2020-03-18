import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices = new ArrayList<>();

    public Vertex createVertex(String name){
        Vertex v = new Vertex(name);
        vertices.add(v);
        return v;
    }

    void addEdge(Vertex source, Vertex dest, int weight){
        source.addEdge(dest, weight);
    }

    void addEdge(Vertex source, Vertex dest, int weight, boolean isBidirectional){
        // if biDirectional is true, then both source and destination vertices will get an edge with same weight,
        // to add different weight, call addEdge(source, dest, weight) function (twice).
        if(isBidirectional)
            addEdge(dest, source, weight);
        addEdge(source, dest, weight);
    }

    public void printNeighbours(Vertex v){

        for(Edge e : v.getEdges()){
            System.out.println(v.getName() + "->" +e.getDest().getName() + " weight = " + e.getWeight());
        }
    }
}
