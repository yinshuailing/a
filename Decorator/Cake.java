package Decorator;

public class Cake implements BirthdayCake {
    public Cake() {
        System.out.println("Cake blank was Created");
    }
    @Override
    public void show() {
        System.out.println("Cake blank");
    }
}
