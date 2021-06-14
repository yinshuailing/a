package Prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyFruit fr1=new Apple();
        MyFruit  fr2=new Banana();

        MyFruitStore.Add(1,fr1);
        MyFruitStore.Add(2,fr2);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());

        MyFruit fru=MyFruitStore.Get(4);
        fru.Display();
    }
}
