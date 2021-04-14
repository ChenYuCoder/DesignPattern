package StrategyPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
