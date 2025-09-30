import java.util.*;

public class day3 {
    static int greet(int x, int y)
    {
        return(x+y);
    }

    public static void main(String args[]) {
        // // int a=18;
        // // double b=a;
        // // System.out.println(b);
        // int num=130;
        // byte b=(byte) num;
        // System.out.println(b);
        // int a=10;
        // int b=3;
        // System.out.println(a+b);
        // System.out.println(a%b);
        // System.out.println(a-b);
        // System.out.println(a/b);
        // System.out.println(a*b);

        // int x=5;
        // int y=8;
        // System.out.println(x>y);
        // System.out.println(x<y);
        // System.out.println(x!=y);
        // System.out.println(x>=y);
        // System.out.println(x<=y);
        // System.out.println(x==y);

        // int age=25;
        // System.out.println(age>18 && age <30);
        // System.out.println(age>18 || age>30);
        // System.out.println(!(age==25));

        // int a=10;
        // System.out.println(a);
        // System.out.println(a+=5);
        // System.out.println(a-=5);
        // System.out.println(a%=5);
        // System.out.println(a/=5);
        // System.out.println(a<<5);
        // System.out.println(a>>5);

        // homework
        // int num = 200;
        // double doubleValue = num;
        // byte byteValue = (byte) num;
        // System.out.println("Integer: " + num);
        // System.out.println("Double: " + doubleValue);
        // System.out.println("Byte: " + byteValue);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter three integers ");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // System.out.println("Original values : "+" a="+a+" ,"+"b="+b+" ,"+"c="+c);
        // double avg=a+b+c/3;
        // System.out.println("The average of given values is "+ avg);
        // // System.out.println("Is a>avg : "+(a>avg));
        // // System.out.println("Is b>avg : "+(b>avg));
        // // System.out.println("Is c>avg : "+(c>avg));
        // a*=2;
        // b+=5;
        // c-=3;
        // System.out.println("Updated values : "+" a="+a+" ,"+"b="+b+" ,"+"c="+c);
        // a++;
        // b++;
        // c++;
        
        // System.out.println("Final outcome of the calculation: a=" + a + " b=" + b + " c=" + c);

        // int age=18;
        // if(age>=18){
        //     System.out.println("You are eligible to vote");
        // }
        // else{
        //     System.out.println("You are not eligible to vote");
        // }

        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your marks: ");
        // int marks=sc.nextInt();
        // if(marks>=90){
        //     System.out.println("Grade A+");
        //     }
        //     else if(marks>=75){
        //         System.out.println("Grade A");
        //         }
        //         else if(marks>=60){
        //             System.out.println("Grade B");
        //             }
        //             else{
        //                 System.out.println("Grade C");
        //                 }
        // System.out.println("Enter day number (1-7): ");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("It's Monday");
        //         break;
        //     case 2:
        //         System.out.println("It's Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("It's Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("It's Thursday");
        //         break;
        //     case 5:
        //         System.out.println("It's Friday");
        //         break;
        //     case 6:
        //         System.out.println("It's Saturday");
        //         break;
        //     case 7:
        //         System.out.println("It's Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day number");
        // }   
        while (true) {
            System.out.println("enter 2 number for addition:");
            int i=sc.nextInt();
            int j=sc.nextInt();
            int addition= greet(i,j);
            System.out.println(addition);
            System.out.println("enter y for continue");
            String choice=sc.next();
            
            if (choice!="y") {
                break;
                
            }
            
            
        }
        
        

    }
        

}


