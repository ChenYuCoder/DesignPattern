package DelegatePattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public class Worker3 extends Employee {

    protected Worker3(String name) {
        super("布置现场", name);
    }

    @Override
    public void work(String workName) {
        System.out.println("我是：" + this.name + "，我擅长：" + this.advantage + "，我正在做：" + workName);
    }
}
