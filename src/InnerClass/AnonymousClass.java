package InnerClass;

abstract class My
{
    abstract void display();
}

class outer
{
    public void meth()
    {
        My m=new My() {
            @Override
            void display() {
                System.out.println("Hello");
            }
        };
        m.display();
    }
}
public class AnonymousClass {
}
