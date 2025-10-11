import java.util.*;
public class queuequestion {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms to print:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int front = queue.poll();
            System.out.println(front);
            queue.add(front*10);
            queue.add(front*10+1);
        }
    }
}
