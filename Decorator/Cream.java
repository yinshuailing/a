package Decorator;

public class Cream extends Decorating {
    public Cream(BirthdayCake birthdayCake) {
        super(birthdayCake);
    }
public void putCream(){
    System.out.println("Add Cream....");
}


}
