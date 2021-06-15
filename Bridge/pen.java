package Bridge;

public  abstract class pen {
    protected  Color color;
    public void setColor(Color color){
        this.color=color;
    }
    public abstract  void draw(String name);
}
