package BuilderPattern;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class Test {

    public static void main(String[] args) {
        // 建造者模式-创建型
        // 使用多个简单的步骤一步一步构建成一个复杂的对象
        // 防止属性过多的类，需要穷举全部构造方法，可以使用建造者模式进行优化
        RobotBuilder robotBuilder = new RobotBuilder();
        robotBuilder.name("A");
        robotBuilder.height(10);
        robotBuilder.weight(20);
        System.out.println(robotBuilder.build());

        RobotBuilderV2 robotBuilderV2 = new RobotBuilderV2();
        System.out.println(robotBuilderV2.name("A").height(30).weight(40).build());
    }

}
