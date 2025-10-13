import java.util.*;
public class DfSgraph {
    private int V; // Number of vertices
    private List<List<Integer>> adj; // Adjacency list 
    public DfSgraph(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); 
    }
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }
    private void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }
    public static void main(String[] args) {
        DfSgraph g = new DfSgraph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2,5);
        System.out.println("DFS starting from vertex 0:");
        g.dfs(3);
    }
    
}