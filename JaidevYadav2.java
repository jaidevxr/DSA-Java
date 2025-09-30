import java.util.*;

public class JaidevYadav2 {

    static Scanner sc = new Scanner(System.in);

    // 1. Data Types & Type Casting
    // Q1: Different data types in Java and print their default values
//     public class Assignment {
//     static int i;
//     static float f;
//     static double d;
//     static char c;
//     static boolean b;
//     static byte by;
//     static short s;
//     static long l;

//     public static void main(String[] args) {
//         System.out.println("int=" + i + " float=" + f + " double=" + d +
//                            " char='" + c + "' boolean=" + b +
//                            " byte=" + by + " short=" + s + " long=" + l);
//     }
// }


    // Q2: Implicit type casting from int to double
    static void q2() {
        int a = 10;
        double b = a;
        System.out.println("Implicit int to double: " + b);
    }

    // Q3: Explicit type casting from double to int
    static void ques3() {
        double d = 9.99;
        int i = (int) d;
        System.out.println("Explicit double to int: " + i);
    }

    // Q4: Find size of primitive data types
    static void q4() {
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        System.out.println("Size of boolean: " + 1 + " byte (not precisely defined)");
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
    }
    
   

    // Q5: Add two numbers of different data types (int + double)
    static void q5() {
        int a = 5;
        double b = 6.5;
        System.out.println("int + double = " + (a + b));
    }

    // 2. Control Structures
    // Q6: Check positive, negative, or zero
    static void q6() {
        int n = -5;
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    // Q7: Find largest of three numbers
    static void q7() {
        int a = 5, b = 9, c = 3;
        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }

    // Q8: Check leap year
    static void q8() {
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is Not Leap Year");
        }
    }

    // Q9: Calculate grade based on marks
    static void q9() {
        int marks = 82;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }

    // Q10: Simple calculator using switch-case
    static void q10() {
        int a = 10, b = 5;
        char op = '+';
        switch (op) {
            case '+': {
                System.out.println("Sum: " + (a + b));
                break;
            }
            case '-': {
                System.out.println("Difference: " + (a - b));
                break;
            }
            case '*': {
                System.out.println("Product: " + (a * b));
                break;
            }
            case '/': {
                System.out.println("Quotient: " + (a / b));
                break;
            }
            default: {
                System.out.println("Invalid operator");
            }
        }
    }

    // 3. Loops
    // Q11: Print numbers from 1 to 100
    static void q11() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Q12: Print even numbers from 1 to 50
    static void q12() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Q13: Multiplication table of a number
    static void q13() {
        int n = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Q14: Sum of digits of a number
    static void q14() {
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // Q15: Check whether a number is prime
    static void q15() {
        int n = 29;
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }

    // 4. Arrays
    // Q16: Read 5 numbers into an array and display
    static void q16() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Q17: Find largest and smallest in array
    static void q17() {
        int[] arr = {5, 2, 9, 1, 6};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }

    // Q18: Sum and average of array elements
    static void q18() {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / (double) arr.length;
        System.out.println("Sum: " + sum + " Avg: " + avg);
    }

    // Q19: Reverse array without using second array
    static void q19() {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Q20: Sort array in ascending order
    static void q20() {
        int[] arr = {5, 3, 1, 4, 2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 5. Strings
    // Q21: Find length of string without toCharArray()
    static void q21() {
        String s = "hello";
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            len++;
        }
        System.out.println("Length: " + len);
    }

    // Q22: Check if two strings are equal without equals()
    static void q22() {
        String s1 = "java";
        String s2 = "java";
        boolean equal = true;
        if (s1.length() != s2.length()) {
            equal = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    equal = false;
                }
            }
        }
        System.out.println(equal ? "Equal" : "Not Equal");
    }

    // Q23: Count vowels and consonants
    static void q23() {
        String s = "My soldiers… rage!Even if we die here, even if the world laughs at us, we fight! We fight because that’s all we can do! We cannot let the cruel world dictate our fate! Even if this is our last battle, we ride forward without hesitation!";
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }

    // Q24: Reverse string using loop
    static void q24() {
        String s = "tony stark was able to build this in a cave with a box of scraps";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }

    // Q25: Check palindrome
    static void q25() {
        String s = "sos";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    // Q26: Convert string to uppercase and lowercase without inbuilt methods ( Gpt helped) 
    static void q26() {
        String s = "Rude GrOgU";
        String up = "";
        String low = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                up += (char)(ch - 32);
                low += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                low += (char)(ch + 32);
                up += ch;
            } else {
                up += ch;
                low += ch;
            }
        }
        System.out.println("Uppercase: " + up);
        System.out.println("Lowercase: " + low);
    }

    // Q27: Count frequency of each character
    static void q27() {
        String s = "I can do this all day";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + ": " + count);
        }
    }

    // Q28: Remove all spaces from string
    static void q28() {
        String s = "With great power comes great responsibility";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    // Q29: Find first non-repeated character
    static void q29() {
        String s = "Dormammu, I've come to bargain";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean repeated = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == ch) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                System.out.println("First non-repeated: " + ch);
                break;
            }
        }
    }

    // Q30: Split string into words without split()
    static void q30() {
        String s = "I am Iron Man";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                System.out.println(word);
                word = "";
            }
        }
        System.out.println(word);
    }

    // 31: Swap two numbers without third variable
    static void q31() {
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }

    // 32: Fibonacci series up to N terms
    static void q32() {
        int n = 10;
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 33: Factorial using recursion
    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    static void q33() {
        int n = 5;
        System.out.println(fact(n));
    }

    // 34: Linear search in array
    static void q34() {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 7;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + pos);
        }
    }

    // 35: Count number of words in string
    static void q35() {
        String s = "I am Groot";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Words: " + count);
    }

    public static void main(String[] args) {
        //run all ques  here
    }
}
