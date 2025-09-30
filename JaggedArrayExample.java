public class JaggedArrayExample {
    public static void main(String[] args) {
        // Creating a jagged array with 3 rows
        int[][] jag = new int[3][];

        // Initializing each row with different sizes
        jag[0] = new int[] { 1, 2 };
        jag[1] = new int[] { 3, 4, 5 };
        jag[2] = new int[] { 6 };

        // Printing the jagged array
        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < jag.length; i++) {
            for (int j = 0; j < jag[i].length; j++) {
                System.out.print(jag[i][j] + " ");
            }
            System.out.println(); 
        }
    }
    
}

    

