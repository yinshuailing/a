package Decorator;

public class test {
    public static void main(String[] args) {
        BirthdayCake birthdayCake=new Cake();
        birthdayCake.show();
        Cream cream=new Cream(birthdayCake);
        cream.putCream();
        Fruit fruit=new Fruit(cream);
        fruit.putFruit();
        fruit.show();
    }
}
