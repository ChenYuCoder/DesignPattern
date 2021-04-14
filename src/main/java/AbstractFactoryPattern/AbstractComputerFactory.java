package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 * <p>
 * 抽象电脑工厂 可生成：鼠标和键盘
 */
public abstract class AbstractComputerFactory {

    /**
     * 生产键盘
     *
     * @return
     */
    public abstract IKeyboard getKeyboard();

    /**
     * 生产鼠标
     *
     * @return
     */
    public abstract IMouse getMouse();


}
