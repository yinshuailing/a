package SimpleFactory;

public class BFactory extends  Factory {
    public Fruit CreateFruit(){
        return new Banana();
    }
}
