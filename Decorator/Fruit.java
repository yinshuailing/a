package Decorator;

public class Fruit extends Decorating {
    public Fruit(BirthdayCake birthdayCake) {
        super(birthdayCake);
    }
public void putFruit(){
    System.out.println("Add fruit......");
}

}
