public class main {
    void shoot()
    {
        System.out.println("Shooting with gun!!");
    }
    
}
class akm extends main{
    void shoot()
    {
        System.out.println("High damage!");
    }
}
class m416 extends main{
    void shoot()
    {
        System.out.println("Good stability!");
    }
}
class awm extends main{
    void shoot()
    {
        System.out.println("One shot one kill!");
    }
}
public class Main{
    public static void main(String[] args) {
        main g1;
        g1 = new akm();
        g1.shoot();

        g1 = new m416();
        g1.shoot();

        g1 = new awm();
        g1.shoot();
    }
}
