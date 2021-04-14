package BridgePattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public class Test {

    public static void main(String[] args) {
        // 桥接模式
        // 将类的功能层次结构和实现层次结构相分离，使二者能够独立地变化，并在两者之间搭建桥梁，实现桥接
        // 将接口的实现和抽象的子类进行组合
        // 抽象父类中：关系（组合逻辑）
        // 子类和实现：各自实现各自的代码
        // 后续在不改变关系逻辑的情况，可以无限制扩展接口的实现和子类
        Shape circle = new Circle();
        circle.setColor(new Red()).print();
    }

}
