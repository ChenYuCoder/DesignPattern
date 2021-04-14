package FlyweightPattern;

import java.util.HashMap;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> SHAPE_MAP = new HashMap<>();

    public static Shape getShape(String color, Class<?> clazz)
      throws IllegalAccessException, InstantiationException {
        String key = color + "_" + clazz.getName();
        Shape shape = SHAPE_MAP.get(key);

        if (shape == null) {
            shape = (Shape) clazz.newInstance();
            shape.setColor(color);
            SHAPE_MAP.put(key, shape);
            System.out.println("Creating color: " + color + ", " + clazz.getName());
        } else {
            System.out.println("cache color: " + color + ", " + clazz.getName());
        }

        return shape;
    }

}
