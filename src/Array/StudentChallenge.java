package Array;

import java.util.Scanner;

public class StudentChallenge {
    public static void main(String[] args) {
        //Finding Sum of all elements

//      int A[] = {1,4,3,5,9,3,4};
//
//      int sum = 0;
//
//      for(int x : A){
//          sum = sum + x;
//
//      }
//        System.out.println("Sum is "+sum);


        //Searching an element
//        Scanner sc = new Scanner(System.in);
//        int A[] = {1,2,4,5,3,6,7,8};
//
//        int key;
//
//        System.out.println("Enter a key ");
//        key = sc.nextInt();
//
//        for(int i=0;i<A.length;i++){
//            if(A[i]==key){
//                System.out.println(i);
//                System.exit(0);
//            }
//        }
//        System.out.println("Not found");


        //Finding Maximum value

        int A[] = {3,53,5,3,6,7,8,34,5};

//        int max = A[0];
//
//        for(int i=0;i<A.length;i++){
//            if(A[i]>max){
//                max = A[i];
//            }
//        }
//        System.out.println("Maximum value is "+max);
        
        //Find Second largest element
        
        int max1 = A[0];
        int max2 = A[0];
        
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2 = max1;
                max1 = A[i];
            } else if (A[i]>max2) {
                max2=A[i];
            }
        }
        System.out.println("Second largest number is "+max2);
    }
}
