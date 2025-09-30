import java.util.*;

public class JaidevYadav {

    // 1. Sort in descending order
    static void sortDescending() {
        int[] marks = { 15, 9, 23, 7, 42 };
        Arrays.sort(marks);
        System.out.print("Numbers (High to Low): ");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    // 2. Find first and last occurrence of a number
    static void findFirstLast() {
        int[] rollNos = { 12, 5, 7, 12, 9, 12 };
        int find = 12, first = -1, last = -1;

        for (int i = 0; i < rollNos.length; i++) {
            if (rollNos[i] == find) {
                if (first == -1) first = i;
                last = i;
            }
        }
        System.out.println("First position: " + first);
        System.out.println("Last position: " + last);
    }

    // 3. Frequency of elements
    static void showFrequency() {
        int[] nums = { 2, 2, 5, 5, 5, 8 };
        boolean[] visited = new boolean[nums.length];

        System.out.println("Frequency of numbers:");
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(nums[i] + " → " + count + " times");
        }
    }

    // 4. Reverse the array
    static void reverseArray() {
        int[] data = { 11, 22, 33, 44, 55 };
        for (int start = 0, end = data.length - 1; start < end; start++, end--) {
            int tmp = data[start];
            data[start] = data[end];
            data[end] = tmp;
        }
        System.out.println("Reversed array: " + Arrays.toString(data));
    }

    // 5. Check if array is sorted
    static void isSorted() {
        int[] arr = { 5, 10, 15, 20, 25 };
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Array sorted? " + sorted);
    }

    // 6. Copy only even numbers
    static void copyEvens() {
        int[] data = { 3, 6, 9, 12, 14, 17 };
        int[] evens = new int[data.length];
        int idx = 0;

        for (int value : data) {
            if (value % 2 == 0) {
                evens[idx++] = value;
            }
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < idx; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }

    // 7. Find the second largest number
    static void secondBiggest() {
        int[] arr = { 25, 67, 12, 99, 54 };
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2 && val != max1) {
                max2 = val;
            }
        }
        System.out.println("Second biggest number: " + max2);
    }

    // 8. Find duplicate elements
    static void showDuplicates() {
        int[] data = { 4, 7, 2, 7, 9, 4 };
        System.out.print("Duplicate values: ");
        for (int i = 0; i < data.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    duplicate = true;
                    break;
                }
            }
            boolean printed = false;
            for (int k = 0; k < i; k++) {
                if (data[k] == data[i]) {
                    printed = true;
                    break;
                }
            }
            if (duplicate && !printed) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }

    // 9. Merge two sorted arrays
    static void mergeArrays() {
        int[] x = { 2, 6, 10 };
        int[] y = { 1, 5, 7 };
        int[] merged = new int[x.length + y.length];

        int i = 0, j = 0, k = 0;
        while (i < x.length && j < y.length) {
            if (x[i] < y[j])
                merged[k++] = x[i++];
            else
                merged[k++] = y[j++];
        }
        while (i < x.length) merged[k++] = x[i++];
        while (j < y.length) merged[k++] = y[j++];

        System.out.println("Merged array: " + Arrays.toString(merged));
    }

    // 10. Binary search without built-in
    static void manualBinarySearch() {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int search = 8;
        int left = 0, right = arr.length - 1;
        boolean present = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == search) {
                System.out.println("Found " + search + " at index " + mid);
                present = true;
                break;
            } else if (arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!present) System.out.println("Not found!");
    }

    public static void main(String[] args) {
        System.out.println("Solutions by Jaidev Yadav\n");

        sortDescending();
        findFirstLast();
        showFrequency();
        reverseArray();
        isSorted();
        copyEvens();
        secondBiggest();
        showDuplicates();
        mergeArrays();
        manualBinarySearch();
    }
}
