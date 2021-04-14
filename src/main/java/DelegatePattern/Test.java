package DelegatePattern;


/**
 * @author chenyu
 * @date 2021/3/31
 */
public class Test {

    public static void main(String[] args) {
        // 委派模式-行为型（不属于GOF23中设计模式）
        // 负责任务的调用和分配任务，是一种特殊的静态代理，可以理解为全权代理
        Leader leader = new Leader("小陈");
        leader.work("笑一个");
        leader.work("写PPT");
        leader.work("拍Video");
        leader.work("布置现场");

    }
}
