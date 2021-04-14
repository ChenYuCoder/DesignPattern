package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class HwMouse implements IMouse {

    @Override
    public void click() {
        System.out.println("华为鼠标点击");
    }
}
