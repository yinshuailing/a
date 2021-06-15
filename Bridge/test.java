package Bridge;

import SimpleFactory.Factory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Color color1;
        pen pen1;

        Properties prop=new Properties();
        FileReader fr=new FileReader("DesignModule\\src\\Bridge\\class.txt");
        prop.load(fr);
        fr.close();

        String className1 = prop.getProperty("penClass");
        String className2=prop.getProperty("colorClass");
        //通过反射来使用
        Class<?> c1= Class.forName(className1);
        Class<?> c2= Class.forName(className2);

        Constructor<?> con1= c1.getConstructor();
        Constructor<?> con2= c2.getConstructor();
        pen1= (pen)con1.newInstance();
        color1=(Color)con2.newInstance();


        pen1.setColor(color1);
        pen1.draw("鲜花");
    }
}
