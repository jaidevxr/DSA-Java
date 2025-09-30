public class JavaRevision {
    //loops and arrays
    //Multiplication table
    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    //reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    //check palindrome
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
    //sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    //largest element in an array
    public static int largestInArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    //sort an array in ascending order
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //strings
    //string length using length() method
    public static int stringLength(String str) {
        return str.length();
    }
    //reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    //check if a string is a palindrome
    public static boolean isStringPalindrome(String str) {
        return str.equals(reverseString(str));
    }
    //count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
    //remove spaces from a string using trim
    public static String removeSpaces(String str) {
        return str.trim();
    }
    //compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
    //functions and matrices
    //function to check prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    //fibonacci series
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
    //transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    //add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    //multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Incompatible matrix dimensions");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 5; // Example number
        multiplicationTable(number);
        System.out.println("Reversed Number: " + reverseNumber(number));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Sum of Digits: " + sumOfDigits(number));
        int[] array = {3, 1, 4, 1, 5, 9};
        System.out.println("Largest in Array: " + largestInArray(array));
        sortArray(array);
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        String str = "hello";
        System.out.println("String Length: " + stringLength(str));
        System.out.println("Reversed String: " + reverseString(str));
        System.out.println("Is String Palindrome: " + isStringPalindrome(str));
        int[] counts = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
        System.out.println("String without spaces: '" + removeSpaces("  " + str +
"  ") + "'");
        System.out.println("Compare Strings: " + compareStrings(str, "hello"));
        System.out.println("Is Prime: " + isPrime(number));
        fibonacciSeries(10);
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transposed = transposeMatrix(matrix);
        System.out.println("Transposed Matrix:");
        for (int[] row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] B = {
            {7, 8, 9},
            {10, 11, 12}
        };
        int[][] sumMatrix = addMatrices(matrix, B);
        System.out.println("Sum of Matrices:");
        for (int[] row : sumMatrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] C = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int[][] productMatrix = multiplyMatrices(matrix, C);
        System.out.println("Product of Matrices:");
        for (int[] row : productMatrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
    }
    
}
