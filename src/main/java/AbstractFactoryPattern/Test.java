package AbstractFactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class Test {

    public static void main(String[] args) {
        // 抽象工厂-创建型
        // 围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂
        // 将工厂进行抽象，定义工厂的规则，必须生成哪些组成部分
        // 抽象电脑工厂：需要生产鼠标，键盘
        // 华为工厂：生产华为鼠标，华为键盘
        // 联想工厂：生产联想鼠标，联想键盘
        AbstractComputerFactory hwFactory = new HwComputerFactory();
        hwFactory.getKeyboard().input();
        hwFactory.getMouse().click();

        AbstractComputerFactory lxFactory = new LxComputerFactory();
        lxFactory.getKeyboard().input();
        lxFactory.getMouse().click();
    }
}
