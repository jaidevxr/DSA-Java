public class StringOperationDemo {
    public static void main(String[] args) {
        //1. Lenght of a string
        String str1 = "Java";
        System.out.println("Length of the string: " + str1.length());
        //2. Concatenation of two strings
        String str2 = "Hello";
        String str3 = "World";
        System.out.println("Concatenated string using concat(): " + str2.concat(" ").concat(str3));
        System.out.println("Concatenated string using + operator: " + str2 + " " + str3);
        //3. Character at a specific index
        System.out.println("Character at index 1: " + str1.charAt(1));
        //4. Substring extraction
        System.out.println("Substring from index 1 to 3: " + str1.substring(1, 3));
        //5. String comparison
        String str4 = "java";
        System.out.println("Are str1 and str4 equal (case-sensitive)? " + str1.equals(str4));
        System.out.println("Are str1 and str4 equal (case-insensitive)? " + str1.equalsIgnoreCase(str4));
        //6. String to upper and lower case
        System.out.println("str1 to upper case: " + str1.toUpperCase());
        System.out.println("str1 to lower case: " + str1.toLowerCase());
        //7. Trimming whitespace
        String str5 = "  Hello World  ";
        System.out.println("Trimmed string: '" + str5.trim() + "'");
        //8. Replacing characters
        System.out.println("Replacing 'a' with 'o' in str1: " + str1.replace('a', 'o'));
        
}
