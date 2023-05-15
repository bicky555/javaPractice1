package InherItance;


class Parents
{
    Parents()
    {
        System.out.println("Non-Param of Parent");
    }
    Parents(int x)
    {
        System.out.println("Param of parent"+x);
    }
}
class Childs extends Parents
{
    Childs()
    {
        System.out.println("Non-Param of Child");
    }
    Childs(int y)
    {
        System.out.println("Param of Child");
    }
    Childs(int x,int y)
    {
        super(x);
        System.out.println("2 Param of Child "+y);
    }
}

class Rectangles
{
    int length;
    int breath;

    Rectangles()
    {
        length=breath=1;
    }
    Rectangles(int l, int b)
    {
        length=l;
        breath=b;
    }
}

class Cuboids extends Rectangles
{
    int height;

    Cuboids()
    {
        height=1;
    }
    Cuboids(int h)
    {
        height=h;
    }

    Cuboids(int l, int b, int h)
    {
        super(l,b);
        height=h;
    }
    int volume()
    {
        return length*breath*height;
    }
}
public class ParametrisedConstructors {
    public static void main(String[] args) {
        Childs c=new Childs(20,10);
        Cuboids cu=new Cuboids(5,3,10);
        System.out.println(cu.volume());
    }
}
