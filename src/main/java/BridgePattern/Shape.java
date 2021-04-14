package BridgePattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public abstract class Shape {

    private Color color;

    public Shape setColor(Color color) {
        this.color = color;
        return this;
    }

    public abstract String show();

    public void print() {
        System.out.println("画出：" + color.show() + "的" + show());
    }
}
