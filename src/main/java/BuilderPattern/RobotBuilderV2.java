package BuilderPattern;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class RobotBuilderV2 {

    private final Robot robot = new Robot();

    public RobotBuilderV2 name(String name) {
        robot.setName(name);
        return this;
    }

    public RobotBuilderV2 height(Integer height) {
        robot.setHeight(height);
        return this;
    }

    public RobotBuilderV2 weight(Integer weight) {
        robot.setWeight(weight);
        return this;
    }

    public Robot build() {
        return robot;
    }


}
