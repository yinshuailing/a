package Bridge;

public class Red  implements Color{
    @Override
    public void bepaint(String pentype, String name) {
        System.out.println(pentype+"红色的"+name+".");
    }
}
