package DecoratorPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public class Test {

    public static void main(String[] args) {
        // 装饰器模式-结构型模式
        // 创建了一个装饰类，用来包装原有的类，提供了额外的功能
        // 在图形的基础上增加染色功能
        Shape t1 = new RedShapeDecorator(new Circle());
        t1.draw();
        Shape t2 = new YellowShapeDecorator(new Circle());
        t2.draw();
        Shape t3 = new RedShapeDecorator(new Rectangle());
        t3.draw();
        Shape t4 = new YellowShapeDecorator(new Rectangle());
        t4.draw();
    }

}
