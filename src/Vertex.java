import java.util.ArrayList;

class Vertex {
    private String name;
    private ArrayList<Edge> edges = new ArrayList<>();

    Vertex(String name){
        this.name = name;
    }

     String getName(){
        return name;
    }

    void addEdge(Vertex v, int weight){
        this.edges.add(new Edge(this, v, weight));
    }

    ArrayList<Edge> getEdges(){
        return edges;
    }

}
