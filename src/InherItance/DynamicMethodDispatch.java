package InherItance;

class Super1
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}
class Sub1 extends Super1{
    @Override
    public void meth2()
    {
        System.out.println("Sub Meth2");
    }
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Super1 sup=new Super1();
//        sup.meth1();
//        sup.meth2();
//
//        Sub1 su=new Sub1();
//        su.meth1();
//        su.meth2();
//        su.meth3();

        Super1 s=new Sub1();
        s.meth1();
        s.meth2();
    }
}
