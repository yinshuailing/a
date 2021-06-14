package Prototype;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable<Integer,MyFruit> fruitHashtable=new Hashtable<Integer,MyFruit>();
     public static   void Add(Integer key,MyFruit mf){
         fruitHashtable.put(key,mf);
     }
     public  static  MyFruit  Get(Integer key) throws CloneNotSupportedException {
       return   (MyFruit) fruitHashtable.get(key).clone();
     }


}

