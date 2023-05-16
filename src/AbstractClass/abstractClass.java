package AbstractClass;


//abstract class // we cannot create object of abstract class // we can just create the refernce
//concrete class

//abstract method don't have the body

//abstract class may have 0 or more abstract method but a abstract method must have a abstract class


abstract class Super
{
    public Super()
    {
        System.out.println("Super Constructor");
    }
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    public abstract void meth2();
}
class Sub extends Super
{
    @Override
    public void meth2() {
        System.out.println("Sub meth2");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        Super s=new Sub();
        s.meth1();
        s.meth2();
    }

}
