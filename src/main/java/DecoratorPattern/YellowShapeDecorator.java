package DecoratorPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public class YellowShapeDecorator extends ShapeDecorator{

    public YellowShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void setColor() {
        System.out.println("染色为黄色");
    }
}
