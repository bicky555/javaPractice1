package Polymorphism;


class Super
{
    protected void display()
    {
        System.out.println("Super Display");
    }
}
class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Super s=new Super();
        s.display();

        Super su=new Sub();
        s.display();
    }
}
