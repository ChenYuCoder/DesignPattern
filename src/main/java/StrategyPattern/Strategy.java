package StrategyPattern;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public interface Strategy {

    /**
     * 操作
     *
     * @param num1 数字1
     * @param num2 数字2
     * @return
     */
    int doOperation(int num1, int num2);
}
