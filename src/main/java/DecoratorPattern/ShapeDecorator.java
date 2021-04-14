package DecoratorPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }


    @Override
    public void draw(){
        shape.draw();
        setColor();
    }

    /**
     * 设置颜色
     */
    public abstract void setColor();
}
