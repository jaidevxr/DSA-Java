class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
public class CustomExceptionAge {
    public static void main(String[] args) {
        int age = 15; 

        try {
            if (age < 18) {
                throw new AgeException("Age must be at least 18: " + age);
            } else {
                System.out.println("Your age is: " + age);
            }
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}