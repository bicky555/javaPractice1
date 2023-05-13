package Methods;

public class StudentChallenge1 {
//    public static void main(String[] args) {
//        // Overload method to calculate areas
//
//        System.out.println(area(4,2));
//    }
//
//    static double area(double radius)
//    {
//        return Math.PI*radius*radius;
//    }
//    static double area(double length,double breath)
//    {
//        return length*breath;
//    }


    //overloaded method to reverse a int or array

    int reverse(int n)
    {
        int rev=0;

        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }


    int [] reverse(int A[])
    {
        int B[]=new int[A.length];

        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];

        return B;
    }


    //overloaded method to validate name and age

    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }


   static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args)
    {
        System.out.println(validate("Bicky"));
    }


}
