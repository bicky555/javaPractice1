package Interfaces;

//Interface is a collection of abstract method

class Phone
{
    public void call()
    {
        System.out.println("Phone call");
    }
    public void sms()
    {
        System.out.println("Phone sending SMS");
    }
}
interface ICamera
{
    void click();
    void record();
}
interface IMusicPlayer
{
    void play();
    void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{

    @Override
    public void click() {
        System.out.println("Smart Phone Clicking Photo");
    }

    @Override
    public void record() {
        System.out.println("Smart Phone recording video");
    }

    @Override
    public void play() {
        System.out.println("Smart Phone playing music");
    }

    @Override
    public void stop() {
        System.out.println("Smart Phone stopped playing music");
    }

    public void videoCall()
    {
        System.out.println("Smart Phone video calling");
    }
}
public class Example1 {
    public static void main(String[] args) {
        SmartPhone s=new SmartPhone();
        s.call();
        s.click();
        s.play();
    }
}
