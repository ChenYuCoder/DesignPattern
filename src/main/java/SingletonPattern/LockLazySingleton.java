package SingletonPattern;

/**
 * @author chenyu
 * @date 2021/3/19 带锁懒汉模式
 * <p>
 * 效率低
 */
public class LockLazySingleton {

    private LockLazySingleton() {
    }

    private static LockLazySingleton INSTANCE;

    public static synchronized LockLazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LockLazySingleton();
        }
        return INSTANCE;

    }

    public void test() {
    }

}
