abstract class shape {
    abstract void area();
}
class Circle extends shape{
    double radius;
    Circle(double radius)
        {
            this.radius = radius;
        }
    void area()
    {
        System.out.println("Area of circle is 3.14*r*r");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        shape s1;
        s1 = new Circle(5);
        s1.area();
    }
}
