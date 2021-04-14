package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class HwKeyboard implements IKeyboard {

    @Override
    public void input() {
        System.out.println("华为键盘输入");
    }
}
