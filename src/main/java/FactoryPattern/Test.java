package FactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // 工厂模式-创建型
        // 将实例创建过程隐藏和简化还可以维护单例，让使用者更加方便
        Car sCar = CarFactory.getCar(SmallCar.class);
        sCar.drive();
        Car bCar = CarFactory.getCar(BigCar.class);
        bCar.drive();
    }

}
