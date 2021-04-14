package DecoratorPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("我是圆形");
    }
}
