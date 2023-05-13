package Methods;

public class Recursion {

    // calling itself and when not able to call it will retrack back to the program

    //Problem solving is done my mathematics, so mathematics have recursion

    static void fun(int n)
    {
        if(n>0)
        {
            fun(n-1);
            System.out.println(n);
//            fun(n-1);
        }
    }

    public static void main(String[] args) {
        fun(3);
    }


}
