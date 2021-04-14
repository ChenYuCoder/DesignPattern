package PrototypePattern.shallow;


import PrototypePattern.Robot;

/**
 * @author chenyu
 * @date 2021/3/22 浅拷贝
 */
public class ShallowRobot extends Robot implements Cloneable {

    @Override
    public ShallowRobot clone() throws CloneNotSupportedException {
        return (ShallowRobot) super.clone();
    }


}
