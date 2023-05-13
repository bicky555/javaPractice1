package InherItance;

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

class Cylinder extends Circle
{
    public double height;
    public  double volume()
    {
        return area()*height;
    }
}

public class Inheritance {
    // Inheritance is used for Specialization
    //Interfaces is used for generalization
    /*
        Interfaces is acquiring the features of the existing class into a new class

     */
    public static void main(String[] args) {

        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;
        //inheritance

        System.out.println("Volume "+c.volume());
        System.out.println("Area "+c.area());
    }
}
