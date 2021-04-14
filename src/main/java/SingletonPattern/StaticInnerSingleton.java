package SingletonPattern;

/**
 * @author chenyu
 * @date 2021/3/19 静态内部类式单例
 * <p>
 * 能被序列化破坏,readResolve
 */
public class StaticInnerSingleton {

    public StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return InnerClass.INSTANCE;

    }

    private static class InnerClass {

        public static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    private Object readResolve() {
        System.out.println("read resolve");
        return InnerClass.INSTANCE;
    }

    public void test() {
    }
}
