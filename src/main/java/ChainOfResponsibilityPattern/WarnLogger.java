package ChainOfResponsibilityPattern;

/**
 * @author chenyu
 * @date 2021/4/13
 */
public class WarnLogger extends AbstractLogger {

    public WarnLogger() {
        this.level = WARN;
        setNextLogger(new ErrorLogger());
    }

    @Override
    public void write(String message) {
        System.out.println("Warn::Logger: " + message);
    }
}
