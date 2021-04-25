package A;

public class BConF implements BFruitAndVegetables{

    @Override
    public Fruit CreateF() {
        Fruit a=new Banana();
        return a;
    }

    @Override
    public vegetables CreateV() {
        vegetables t= new tomato();
        return t;
    }
}
