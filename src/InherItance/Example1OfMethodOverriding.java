package InherItance;


class Car
{
    public void start(){
        System.out.println("Car started");
    }
    public void accelerate()
    {
        System.out.println("Car is accelerated");
    }
    public void changeGear()
    {
        System.out.println("Car gear changed");
    }
}
class LuxaryCar extends Car
{
    @Override
    public void changeGear()
    {
        System.out.println("Automatic Gear");
    }
    public void openRoof()
    {
        System.out.println("Sun Roof is opened");
    }
}
public class Example1OfMethodOverriding {
    public static void main(String[] args) {
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
    }
}
