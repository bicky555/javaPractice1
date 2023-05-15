package InherItance;


class TV
{
    public void switchOn()
    {
        System.out.println("TV is Switched ON");
    }
    public void changeChannel()
    {
        System.out.println("TV channel is change ");
    }
    public void browse()
    {
        System.out.println("Smart TV is browsing ");
    }
}

class SmartTV extends TV
{
    @Override
    public void switchOn() {
//        super.switchOn();
        System.out.println("SmartTV is switched ON");
    }

    @Override
    public void changeChannel() {
//        super.changeChannel();
        System.out.println("Smart TV channel is changed ");
    }
}
public class ExampleOfMethodOverriding {
    public static void main(String[] args) {
//        TV t=new TV();
//        t.switchOn();
//        t.changeChannel();
//
//        SmartTV st=new SmartTV();
//        st.switchOn();
//        st.changeChannel();

        TV tv=new SmartTV();
        tv.switchOn();
        tv.changeChannel();
    }
}
