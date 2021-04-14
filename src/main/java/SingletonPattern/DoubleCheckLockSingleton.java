package SingletonPattern;

/**
 * @author chenyu
 * @date 2021/3/19
 * <p>
 * 双检锁
 * <p>
 * 线程安全，效率相对低，可以被反射破坏
 */
public class DoubleCheckLockSingleton {

    private DoubleCheckLockSingleton() {
    }

    private static DoubleCheckLockSingleton INSTANCE;

    public static DoubleCheckLockSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockSingleton();
                }
            }

        }
        return INSTANCE;

    }

    public void test() {
    }
}
