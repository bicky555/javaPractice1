package InherItance;

class Super
{
    public void display()
    {
        System.out.println("Super Class Display ");
    }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub class Display");
    }
}

public class MethodOverriding {

    //Redefining the method of superclass in subclass
    // Dynamic dispatch --> A superclass reference holding the object of a subclass and overridden method is called

    public static void main(String[] args) {
//        Super su=new Super();
//        su.display();
//
//        Sub s=new Sub();
//        s.display();

        Super sup = new Sub();
        sup.display();
    }
}
