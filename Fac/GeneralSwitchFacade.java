package Fac;

public class GeneralSwitchFacade {
    private Light light[]=new Light[4];
    private Fan fan;
    private AirCondition ac;
    private  Television tv;

    public  GeneralSwitchFacade(){
        light[0]=new Light("左前");
        light[1]=new Light("右前");
        light[2]=new Light("左后");
        light[3]=new Light("右后");

        fan  =new Fan();
        ac=new AirCondition();
        tv=new Television();
    }
    public void on(){
        light[0].on();
        light[1].on();
        light[2].on();
        light[3].on();
        ac.on();
        fan.on();
        tv.on();
    }
   public void off(){
       light[0].off();
       light[1].off();
       light[2].off();
       light[3].off();
       ac.off();
       fan.off();
       tv.off();
   }

}
