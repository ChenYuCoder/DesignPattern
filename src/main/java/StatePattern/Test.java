package StatePattern;

import StatePattern.old.NoPatternGumballMachine;

/**
 * @author chenyu
 * @date 2021/4/9
 */
public class Test {

    public static void main(String[] args) {

        // 状态模式-行为型
        // 解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
        // 不使用：在函数内使用if/switch进行状态判断，做不同的动作
        // 使用：主体不关心不同状态的动作内容，和边界情况，只能感知到当前状态和进行状态切换，具体实现由各个状态去实现，主体需要将状态切换的权利交给状态实体
        NoPatternGumballMachine noPatternGumballMachine = new NoPatternGumballMachine(3);
        noPatternGumballMachine.insertQuarter();
        noPatternGumballMachine.turnCrank();
        noPatternGumballMachine.dispense();
        noPatternGumballMachine.insertQuarter();
        noPatternGumballMachine.turnCrank();
        noPatternGumballMachine.dispense();
        noPatternGumballMachine.insertQuarter();
        noPatternGumballMachine.turnCrank();
        noPatternGumballMachine.dispense();
        noPatternGumballMachine.insertQuarter();
        noPatternGumballMachine.turnCrank();
        noPatternGumballMachine.dispense();
        noPatternGumballMachine.ejectQuarter();

        System.out.println("-----------------------------------------------------------");

        GumballMachine gumballMachine = new GumballMachine(10);
        NoQuarterState noQuarterState = new NoQuarterState(gumballMachine);
        gumballMachine.setState(noQuarterState);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
        gumballMachine.insertQuarter();
        noPatternGumballMachine.turnCrank();
        noPatternGumballMachine.dispense();
        gumballMachine.ejectQuarter();


    }

}
