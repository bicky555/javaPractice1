package AbstractClass;


abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape{
    double radius;
    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{

    double length;
    double breath;
    @Override
    public double perimeter() {
        return 2*(length+breath);
    }

    @Override
    public double area() {
        return length*breath;
    }
}
public class Example1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breath=5;

        Shape s=r;
        System.out.println(s.area());
    }
}
