package Bridge;

public class SmallPen extends pen {

    @Override
    public void draw(String name) {
         String pentype="小号毛笔绘制";
         this.color.bepaint(pentype,name);
    }
}
