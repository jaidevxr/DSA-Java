import java.util.*;
public class maddy {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input A Number: ");
        int n=sc.nextInt();
        if(n<=0)
        {
        System.out.println("Invalid Input ");
        }
        else 
        {
            for(int i=1;i<=n;i++)
            {
                if(i!=n)
                System.out.print(i+ " , ");
                else 
                System.out.print(i);
            }
            int sum=0;
            int i=1;
            while(i<=n)
            {
                if(i%2==0)
                    sum=sum+i;
                i++;
            }
            System.out.println("\nSum of even = "+ sum);

            int j=1;
            do
            {
                System.out.println(n+ "X" +j+ "=" +(n*j));
                j++;
            }while(j<=10);

            System.out.print("Input a Number : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    int c=0;
                    for(int x=1;x<=n;x++)
                    {
                        if(n%x==0)
                        c++;
                    }
                    if(c==2)
                        System.out.println("Prime");
                    else
                        System.out.println("Not Prime");
                    break;

                case 2: 
                    if(n%2==0)
                        System.out.println("Even");
                    else
                        System.out.println("Odd");
                    break;

                default:
                    System.out.println("Exit");
                    break;
            }
        }
    }
}
