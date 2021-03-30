package demo02;

public class TextSource implements AbstractSource {
    @Override
    public void source_test() {
        System.out.println("我是TextSource的方法一");
    }

    public void source_test2() {
        System.out.println("我是TextSource的方法二");
    }
}
