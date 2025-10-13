public class findcentrestargraph {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{4,2}};
        int center = findCenter(edges);
        System.out.println("Center of the star graph is: " + center);
    }

    public static int findCenter(int[][] edges) {
        
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }
    }
}
