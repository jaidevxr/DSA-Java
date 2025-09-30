public class StringBuilderOperationsDemo {
    public static void main(String[] args) {
        // 1. Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + sb.toString());

        // 2. Appending to a StringBuilder
        sb.append(" World");
        System.out.println("After appending: " + sb.toString());

        // 3. Inserting into a StringBuilder
        sb.insert(5, ",");
        System.out.println("After inserting: " + sb.toString());

        // 4. Replacing in a StringBuilder
        sb.replace(0, 5, "Hi");
        System.out.println("After replacing: " + sb.toString());

        // 5. Deleting from a StringBuilder
        sb.delete(2, 3);
        System.out.println("After deleting: " + sb.toString());

        // 6. Reversing a StringBuilder
        sb.reverse();
        System.out.println("After reversing: " + sb.toString());

        // 7. Length of a StringBuilder
        System.out.println("Length of StringBuilder: " + sb.length());

        // 8. Converting StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final string: " + finalString);
    }
}
    

