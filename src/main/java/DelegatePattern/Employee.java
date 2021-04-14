package DelegatePattern;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public abstract class Employee {

    public final String advantage;
    protected final String name;

    protected Employee(String advantage, String name) {
        this.advantage = advantage;
        this.name = name;
    }

    /**
     * 工作
     *
     * @param workName 工作名称
     */
    public abstract void work(String workName);
}
