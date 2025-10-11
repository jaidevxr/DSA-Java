class NegnumberException extends Exception {
    public NegnumberException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int number = -5; 

        try {
            if (number < 0) {
                throw new NegnumberException("Negative numbers are not allowed: " + number);
            } else {
                System.out.println("The number is: " + number);
            }
        } catch (NegnumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}