package Polymorphism;

// one name different actions, Poly - many    morphism - forms

class Test
{
    public int max(int a, int b)
    {
        return a>b?a:b;
    }
    public int max(int a, int b, int c)
    {
        if(a>b && a>c) return a;
        else if (b>c) return b;
        return c;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Test t=new Test();
        t.max(10,5);
        t.max(10,15,5);
    }
}
