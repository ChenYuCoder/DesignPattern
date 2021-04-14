package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18 联想电脑工厂
 */
public class LxComputerFactory extends AbstractComputerFactory {

    @Override
    public IKeyboard getKeyboard() {
        return new LxKeyboard();
    }

    @Override
    public IMouse getMouse() {
        return new LxMouse();
    }
}
