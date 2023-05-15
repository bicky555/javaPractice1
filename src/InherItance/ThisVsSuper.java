package InherItance;

//This
class Rect
{
    int length;
    int breath;

    Rect(int l,int b)
    {
        this.length=l;
        this.breath=b;
    }

    void display()
    {
        System.out.println("Length "+this.length);
        System.out.println("Breath "+this.breath);
    }


    // Super keyword

    

}
public class ThisVsSuper {
    public static void main(String[] args) {
        Rect r=new Rect(10,20);
        r.display();
        Rect r1=new Rect(20,30);
        r1.display();
    }

}
