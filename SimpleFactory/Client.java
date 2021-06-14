package SimpleFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Factory factory = new Factory();
//        Fruit fruit =factory.CreateFruit("B");
//        Factory factory=new BFactory();
//        Fruit fruit = factory.CreateFruit();
//        fruit.eat();
        Properties prop=new Properties();
        FileReader fr=new FileReader("DesignModule\\src\\SimpleFactory\\class.txt");
        prop.load(fr);
        fr.close();



        String className = prop.getProperty("className");
        //通过反射来使用
        Class<?> c= Class.forName(className);
        Constructor<?> con= c.getConstructor();
        Object obj = con.newInstance();
        Factory factory=(Factory)obj;
        Fruit fruit = factory.CreateFruit();
        fruit.eat();

    }
}
