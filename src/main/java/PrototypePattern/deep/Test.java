package PrototypePattern.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class Test {

    public static void main(String[] args) {
        // 通过序列化和反序列化实现深拷贝
        DeepRobot deepRobot = new DeepRobot();
        deepRobot.setHeight(1);
        deepRobot.setName("A");
        deepRobot.setWeight(2);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        deepRobot.setSpareParts(list);

        System.out.println(deepRobot);

        DeepRobot clone = (DeepRobot) clone(deepRobot);
        assert clone != null;
        clone.getSpareParts().add("3");
        System.out.println(clone);

    }

    private static Object clone(Object object) {
        byte[] bytes = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
          ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(object);
            bytes = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            assert bytes != null;
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
              ObjectInputStream ois = new ObjectInputStream(bis)) {
                return ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
