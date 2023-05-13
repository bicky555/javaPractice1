package ObjectOrientedProgramming;

class Rectangle2
{
    private double length;
    private double breath;

    //Constructor will have same name as the class
    //They don't have any return type

    public Rectangle2()
    {
        length=1;
        breath=1;
    }
    public Rectangle2(double l,double b)
    {
        length=l;
        breath=b;
    }
    public Rectangle2(double s)
    {
        length=breath=s;
    }

    public double getLength()
    {
        return length;
    }
    public double getBreath()
    {
        return breath;
    }

    public void setLength(double l)
    {
        if (l>=0)
            length=l;
        else
            length=0;
    }
    public void setBreath(double b)
    {
        if (b>=0)
            breath=b;
        else
            breath=0;
    }

    public double area()
    {
        return getLength()*getBreath();
    }
    public double perimeter()
    {
        return 2*(length+breath);
    }
    public  boolean isSquare()
    {
        if (length==breath)
            return true;
        else
            return false;
    }
}

public class Constructors {
    public static void main(String[] args) {
        //every class in java will have a default constructor if we don't create a constructor

        Rectangle2 r=new Rectangle2(10,5);

        System.out.println(r.area());



    }
}
