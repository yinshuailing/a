package A;

public class BConV implements BFruitAndVegetables {

    @Override
    public Fruit CreateF() {
        Fruit a=new Banana();
        return a;
    }

    @Override
    public vegetables CreateV() {
        vegetables t= new cabbage();
        return t;
    }
}
