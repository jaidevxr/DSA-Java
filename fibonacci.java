public class fibonacci {
    public static void main(String[] args) {
        
        for (int n = 50, a = 0, b = 1; a <= n; b = a + b, a = b - a) System.out.print(a + " ");
    }
}
