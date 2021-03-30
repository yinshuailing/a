public abstract class Image {
    protected ImageImp imp;

    public abstract void setImageImp(ImageImp imp);
    public abstract void parseFile(String fileName);
}
