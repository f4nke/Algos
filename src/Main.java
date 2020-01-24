public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(1,3);
        graph.addEdge(4,5);
        graph.addEdge(4,6);
        graph.addEdge(1,5);
        graph.addEdge(5,7);
        graph.addEdge(2,8);

        BreadthPath bp = new BreadthPath(graph, 2);

        System.out.println(bp.pathTo(7));


    }
}
