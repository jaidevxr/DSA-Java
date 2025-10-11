public class ExceptionHandling {
    
    public static void main(String[] args) {
        try {
            int data = 100 / 0; 
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }

    }
}
