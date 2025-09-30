// // // import java.util.Arrays;
// // // public class array {
// // //     public static void main(String[] args) {
// // //         int[] b = {10, 40, 80, 90, 100, 20}; 

// // //         for (int i = 0, r = b.length - 1; i < r; i++, r--) {
// // //             int tmp = b[i];
// // //             b[i] = b[r];
// // //             b[r] = tmp;
// // //         }
// // //         System.out.println(Arrays.toString(b));

// // //         for (int i = 0; i < b.length; i++) {
// // //             System.out.print(b[i] + " ");
// // //         }
// // //         for (int i=0; i < b.length; i++) {
// // //             for (int j=i+1; j < b.length; j++) {
// // //                 if (b[i] > b[j]) {
// // //                     int temp = b[i];
// // //                     b[i] = b[j];
// // //                     b[j] = temp;
// // //                 }
// // //             }
// // //         }
// // //         for (int i = 0; i < b.length; i++) {
// // //             System.out.print(b[i] + " ");
// // //         }
// // //     }
// // // }
// // import java.util.Arrays;

// // public class array {
// //     public static void main(String[] args) {
// //         // Original array
// //         int[] src = {1, 2, 3, 4, 5};

// //         // Copy first 3 elements
// //         int[] first3 = Arrays.copyOf(src, 3); // {1, 2, 3}

// //         // Copy a range (from index 1 to 3, exclusive of 4)
// //         int[] mid = Arrays.copyOfRange(src, 1, 4); // {2, 3, 4}

// //         // Display all arrays
// //         System.out.println("Original src array : " + Arrays.toString(src));
// //         System.out.println("First 3 elements   : " + Arrays.toString(first3));
// //         System.out.println("Middle elements(1-3): " + Arrays.toString(mid));
// //         int[][] arr = {
// //         {1, 2, 3},
// //         {4, 5, 6},
// //         {7, 8, 9}
// //     };
// //     }
// // }
// public class array {
//     public static void main(String[] args) {
//         int[][] jag = new int[3][];

    
//         jag[0] = new int[]{1, 2};
//         jag[1] = new int[]{3,4, 5};
//         jag[2] = new int[]{6};

        
//         System.out.println("Jag Array Contents:");
//         for (int i = 0; i < jag.length; i++) {
//             for (int j = 0; j < jag[i].length; j++) {
//                 System.out.print(jag[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
public class array {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
        
            {7, 8, 9}
        };

        System.out.println("Printing the 2D grid:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}