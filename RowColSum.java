public class RowColSum {
    public static int rowSum(int[][] matrix, int rowIndex) {
        int sum = 0;
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            sum += matrix[rowIndex][j];
        }
        return sum;
    }
    public static int colSum(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (colIndex < matrix[i].length) {
                sum += matrix[i][colIndex];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rowIndex = 1; // Second row
        int colIndex = 2; // Third column

        System.out.println("Sum of row " + rowIndex + ": " + rowSum(matrix, rowIndex));
        System.out.println("Sum of column " + colIndex + ": " + colSum(matrix, colIndex));
    }
    
}
