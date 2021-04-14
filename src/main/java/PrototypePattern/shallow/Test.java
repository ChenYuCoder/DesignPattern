package PrototypePattern.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型模式-创建型
        // 用于创建重复的对象，同时又能保证性能
        // 浅拷贝：仅拷贝属性值的内存地址
        // 实现CloneAble接口，重写clone方法，调用Object.clone()
        // 深拷贝：通过序列化和反序列化进行实现
        ShallowRobot shallowRobot = new ShallowRobot();
        shallowRobot.setName("A");
        shallowRobot.setHeight(1);
        shallowRobot.setWeight(2);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        shallowRobot.setSpareParts(list);
        ShallowRobot clone = shallowRobot.clone();
        clone.setWeight(3);
        clone.setHeight(4);
        clone.getSpareParts().add("3");
        System.out.println(shallowRobot);
        System.out.println(clone);
    }

}
