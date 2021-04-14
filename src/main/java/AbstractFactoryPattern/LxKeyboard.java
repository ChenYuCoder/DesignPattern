package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class LxKeyboard implements IKeyboard{

    @Override
    public void input() {
        System.out.println("联想键盘输入");
    }
}
