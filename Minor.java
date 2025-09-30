import java.util.*;
public class Minor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Kirti's Age");
        int n=sc.nextInt();
        if(n>=1)
        System.out.println("Positive");
        else if(n==0)
        System.out.println("Zero");
        else 
        System.out.println("Negative");

        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }

        switch(n)
        {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        
        }
    }
}
