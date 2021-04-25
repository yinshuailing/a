package A;

public class AConV implements AFruitAndVegetables {

    @Override
    public Fruit CreateF() {
        Fruit a=new Apple();
        return a;
    }

    @Override
    public vegetables CreateV() {
        vegetables t= new cabbage();
        return t;
    }
}
