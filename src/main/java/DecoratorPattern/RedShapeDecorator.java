package DecoratorPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void setColor() {
        System.out.println("染色为红色");
    }
}
