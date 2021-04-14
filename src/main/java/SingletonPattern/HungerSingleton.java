package SingletonPattern;

/**
 * @author chenyu
 * @date 2021/3/19
 * <p>
 * 饿汉式单例
 * <p>
 * 在没有被使用的时候就被创建，某些情况浪费内存
 */
public class HungerSingleton {

    private HungerSingleton() {
    }

    private static final HungerSingleton INSTANCE = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return INSTANCE;
    }

    public void test() {
    }

}
