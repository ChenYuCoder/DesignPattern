package ChainOfResponsibilityPattern;

/**
 * @author chenyu
 * @date 2021/4/13
 */
public class Test {

    public static void main(String[] args) {

        // 责任链模式-行为型
        // 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，
        // 并且沿着这条链传递请求，直到有对象处理它为止。
        AbstractLogger loggerChain = new ConsoleLogger();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.WARN,
          "This is a warn level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
          "This is an error information.");

        loggerChain.logMessage(5,
          "This is an error information.");
    }
}
