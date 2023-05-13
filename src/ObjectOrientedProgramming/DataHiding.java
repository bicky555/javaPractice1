package ObjectOrientedProgramming;

class Rectangle1
{
    private double length;
    private double breath;

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
        length=l;
    }
    public void setBreath(double b)
    {
       breath=b;
    }

    public double area()
    {
        return length*breath;
    }
    public double perimeter()
    {
        return 2*(length+breath);
    }
    public boolean isSquare()
    {
        if(length==breath)
            return true;
        else
            return false;
    }
}
public class DataHiding {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();

        r.setLength(10.5);
        r.setBreath(5.5);

        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());

        System.out.println(r.getLength());
        System.out.println(r.getBreath());
    }




}
