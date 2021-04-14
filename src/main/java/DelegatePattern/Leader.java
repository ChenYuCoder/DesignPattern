package DelegatePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyu
 * @date 2021/3/31
 */
public class Leader extends Employee {

    private final Map<String, Employee> employee = new HashMap<>();

    protected Leader(String name) {
        super("管理员工", name);
        Employee worker1 = new Worker1("小张");
        Employee worker2 = new Worker2("小王");
        Employee worker3 = new Worker3("小李");
        employee.put(worker1.advantage, worker1);
        employee.put(worker2.advantage, worker2);
        employee.put(worker3.advantage, worker3);
    }


    @Override
    public void work(String workName) {
        System.out.println(name + "：来任务了，我看看谁适合");
        if (employee.containsKey(workName)) {
            employee.get(workName).work(workName);
        } else {
            System.out.println(name + "：没人适合只有我来了");
        }
    }
}
