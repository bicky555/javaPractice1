package InherItance;


class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

class GrandParent extends Child
{
    public GrandParent()
    {
        System.out.println("GrandParent Constructor");
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        GrandParent g=new GrandParent();
    }

}
