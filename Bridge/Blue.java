package Bridge;

public class Blue implements Color {
    @Override
    public void bepaint(String pentype, String name) {
        System.out.println(pentype+"蓝色的"+name+".");

    }
}
