package FactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class SmallCar implements Car {

    @Override
    public void drive() {
        System.out.println("小汽车突突突");
    }
}
