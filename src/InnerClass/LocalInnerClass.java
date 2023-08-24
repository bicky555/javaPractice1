package InnerClass;

class Circle
{
    void Display()
    {
        class Inner
        {
            void innerDisplay()
            {
                System.out.println("hello");
            }
        }
        Inner i=new Inner();
        i.innerDisplay();
    }
}
public class LocalInnerClass {
}
