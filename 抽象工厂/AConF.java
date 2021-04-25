package A;

public class AConF implements AFruitAndVegetables{

    @Override
    public Fruit CreateF() {
        Fruit a=new Apple();
        return a;
    }

    @Override
    public vegetables CreateV() {
        vegetables t= new tomato();
        return t;
    }
}
