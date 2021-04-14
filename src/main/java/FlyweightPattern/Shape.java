package FlyweightPattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public abstract class Shape {

    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 展示
     */
    abstract void show();

}
