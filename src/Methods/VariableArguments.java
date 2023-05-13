package Methods;

public class VariableArguments {
    public static void main(String[] args) {

        show();
        show(10,20,30);
        show(new int[] {3,5,6,5,3,5,2});
        showList("John","Bicky","Mori");
    }

    static void show(int ...A){
        for(int x:A)
        {
            System.out.println(x);
        }
    }

    static void showList(String ...S){
        for(int i=0;i<S.length;i++){
            System.out.println(i+1+". "+S[i]);
        }
    }
}
