package FactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class CarFactory {

    public static Car getCar(Class<? extends Car> clazz)
      throws IllegalAccessException, InstantiationException {
        return (Car) clazz.newInstance();
    }
}
