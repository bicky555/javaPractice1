package Methods;

public class Method {
    /*
            returnType methodName(parameterList)
            {
                  Body
            }

        */

//    static int max(int x,int y)
//    {
//        if(x>y)
//            return x;
//        else
//            return y;
//    }
//    public static void main(String[] args)
//    {
//        int a=10,b=15;
// Creating object of method
//        Method mp=new Method();
//        System.out.println(mp.max(a,b));
//        System.out.println(max(a,b));


        //If the value of formal parameter is changed it will not effect the actual parameter

        static void inc(int x) {
            x++;
            System.out.println(x);
        }

    public static void main(String[] args) {
        int a=10;
        inc(a);
        System.out.println(a);
    }

        
    }

