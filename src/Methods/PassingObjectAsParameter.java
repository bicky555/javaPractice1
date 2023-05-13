package Methods;

public class PassingObjectAsParameter {

//    static void update(int A[])
//    {
//        A[0]= 25;
//    }
//
//    public static void main(String[] args)
//    {
//        int A[]={2,3,4,5,6};
//        update(A);
//        System.out.println(A[0]);
//    }


    static void change(int A[],int index, int value)
    {
        A[index]=value;
    }

    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        change(A,2,20);
        for(int x:A){
            System.out.print(x+",");
        }
    }
}
