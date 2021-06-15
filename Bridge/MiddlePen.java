package Bridge;

public class MiddlePen extends pen {
    @Override
    public void draw(String name) {
        String pentype="中号毛笔绘制";
        this.color.bepaint(pentype,name);
    }
}
