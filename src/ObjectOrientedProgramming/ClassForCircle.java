package ObjectOrientedProgramming;

//For every class java will create seperate class file
class Circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
public class ClassForCircle {

    //Properties : radius
    //Methods : area() , perimeter(), circumference()

    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=7;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
        Circle c2=new Circle();
        c1.radius=14;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
    }
}
