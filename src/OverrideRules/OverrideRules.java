package OverrideRules;

class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class OverrideRules {

    // We cannot override static and final method
    public static void main(String[] args) {
        Sub s=new Sub();
        s.display();
    }
}
