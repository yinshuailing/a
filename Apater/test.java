package Apater;

import Prototype.Apple;
import Prototype.Banana;
import Prototype.MyFruit;
import Prototype.MyFruitStore;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        NewJuicer newJuicer=new Apater();
        MyFruit fr1=new Apple();
        MyFruit  fr2=new Banana();
        MyFruitStore mfs=MyFruitStore.Getfruitstore();
        mfs.Add(1,fr1);
        mfs.Add(2,fr2);
        mfs.Add(3,new Apple());
        mfs.Add(4,new Banana());

        System.out.println(newJuicer.newPort(mfs.Get(1),mfs.Get(2)));
    }
}
