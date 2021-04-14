package StrategyPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public class Test {

    public static void main(String[] args) {
        // 策略模式-行为型
        // 避免if else 和switch的复杂和扩展性
        // 使用多个实现类来区分行为
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
