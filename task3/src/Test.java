import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        try {
            InputStream inputStream =new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\task3\\src\\pro.xml");
            Properties properties =new Properties();
            try {
                properties.load(inputStream);
                Image img= null;
                ImageImp imp= null;
                try {
                    img = (Image) Class.forName(properties.getProperty("ImageType")).newInstance();
                    imp=(ImageImp) Class.forName(properties.getProperty("ImpType")).newInstance();
                    img.parseFile("");
                    img.setImageImp(imp);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                System.out.println("文件流对象创建失败！");
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到配置文件！");
        }
    }
}
