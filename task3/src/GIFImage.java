public class GIFImage extends Image{
    @Override
    public void setImageImp(ImageImp imp) {
        this.imp=imp;
        imp.doPaint(new Matrix(this));
    }

    @Override
    public void parseFile(String fileName) {
        System.out.println("对应装载["+this.getClass().getName().replaceAll("Image","")+"]格式的图片文件");
    }
}
