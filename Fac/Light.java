package Fac;

public class Light {
    private  String postion;
    public Light(String postion) {
        this.postion=postion;
    }

    public void on(){
        System.out.println("打开"+postion+"灯");
    }
    public void off(){
        System.out.println("关闭"+postion+"灯");
    }
}
