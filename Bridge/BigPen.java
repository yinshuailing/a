package Bridge;

public class BigPen extends pen {
    @Override
    public void draw(String name) {
        String pentype="大号毛笔绘制";
        this.color.bepaint(pentype,name);
    }
}
