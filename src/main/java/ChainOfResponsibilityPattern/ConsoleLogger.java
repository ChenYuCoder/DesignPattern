package ChainOfResponsibilityPattern;

/**
 * @author chenyu
 * @date 2021/4/13
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger() {
        this.level = INFO;
        setNextLogger(new WarnLogger());
    }

    @Override
    public void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
