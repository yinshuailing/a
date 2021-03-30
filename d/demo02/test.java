package demo02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.io.*;


public class test {
    public static void main(String[] args) {
        Properties pro = new Properties(); //创建集合对象
        FileInputStream fs;

        try {
            fs = new FileInputStream("src/demo02/config.xml");
            pro.load(fs);
            fs.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到配置文件");
        } catch (IOException e) {
            System.out.println("内容读取失败");
        }
        System.out.println(pro.getProperty("SourceName"));
        System.out.println(pro.getProperty("MethodName"));

        String SourceName = pro.getProperty("SourceName");
        String MethodName = pro.getProperty("MethodName");

        try {
            Class cls = Class.forName(SourceName);
            Method m = cls.getMethod(MethodName);
            m.invoke(cls.newInstance(), args);
        } catch (ClassNotFoundException e) {
            System.out.println("类型不存在");
        }  catch (NoSuchMethodException e) {
            System.out.println("方法不存在");
        } catch (IllegalAccessException e) {
            System.out.println("newInstance有问题");
        } catch (InvocationTargetException e) {
            System.out.println("newInstance有问题");
        } catch (InstantiationException e) {
            System.out.println("newInstance有问题");
        }
    }
}