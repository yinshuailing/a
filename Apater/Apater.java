package Apater;

import Prototype.MyFruit;

public class Apater extends  OldJuice implements  NewJuicer{
    @Override
    public String newPort(MyFruit fruit1, MyFruit fruit2) {
        return  onePort(fruit1)+onePort(fruit2);
    }


}
