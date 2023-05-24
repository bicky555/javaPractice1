package Interfaces;

interface Test1
{

    //By default the methods are public and abstract
    //We can have identifier in interface with upper cases
    //interface can have static method with a body
    //default methods are also allowed in interface
    //we can write private method not abstract. private methods are only useful in default methods
    int X=10;  //This identifiers are static and final
    void meth1();
    void meth2();

    /*public static */ default void meth3()
    {
        System.out.println("Meth3 of test");
    }
}

//interface can extend from another interface
interface Test2 extends Test1
{
    void meth4();
}

class My1 implements Test2
{
    public void meth1(){};

    @Override
    public void meth2() {

    }

    @Override
    public void meth4() {

    }
}
public class DoAndDont {
    public static void main(String[] args) {
        System.out.println(Test1.X);
        My1 m=new My1();
        m.meth3();
    }
}
