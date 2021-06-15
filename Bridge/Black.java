package Bridge;

public class Black implements Color {
    @Override
    public void bepaint(String pentype, String name) {
        System.out.println(pentype+"黑色的"+name+".");

    }
}
