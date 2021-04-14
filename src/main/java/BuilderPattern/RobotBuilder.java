package BuilderPattern;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class RobotBuilder {

    private final Robot robot = new Robot();

    public void name(String name) {
        robot.setName(name);
    }

    public void height(Integer height) {
        robot.setHeight(height);
    }

    public void weight(Integer weight) {
        robot.setWeight(weight);
    }

    public Robot build() {
        return robot;
    }


}
