package Methods;

public class StudentChallenge {
//    public static void main(String[] args) {
//
//        //Find a number is Prime
//        System.out.println(isPrime(19));
//
//    }
//
//    static boolean isPrime(int n)
//    {
//        for(int i=2;i<n/2;i++){
//            if(n%i==0)
//                return false;
//        }
//        return true;
//    }


    //Find GCD of 2 numbers

    static int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }

    public static void main(String[] args)
    {

        System.out.println(gcd(35,56));

    }
}
