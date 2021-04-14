package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18 华为电脑工厂
 */
public class HwComputerFactory extends AbstractComputerFactory {

    @Override
    public IKeyboard getKeyboard() {
        return new HwKeyboard();
    }

    @Override
    public IMouse getMouse() {
        return new HwMouse();
    }
}
