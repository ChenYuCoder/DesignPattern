package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class LxMouse implements IMouse {

    @Override
    public void click() {
        System.out.println("联想鼠标点击");
    }
}
