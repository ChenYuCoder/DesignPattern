package SingletonPattern;

/**
 * @author chenyu
 * @date 2021/3/19
 * <p>
 * 懒汉模式
 * <p>
 * 线程不安全
 */
public class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton INSTANCE;

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;

    }

    public void test() {
    }


}
