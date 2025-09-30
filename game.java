import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.print("Enter number to guess (0-10): ");
            int n = sc.nextInt();
            
            int guess = rand.nextInt(11);
            
            if (guess == n) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost! The number was: " + guess);
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next().toLowerCase();

            if (!choice.equals("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        sc.close();
    }
}
