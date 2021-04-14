package FactoryPattern;

/**
 * @author chenyu
 * @date 2021/3/18
 */
public class BigCar implements Car {

    @Override
    public void drive() {
        System.out.println("大汽车突突突");
    }
}
