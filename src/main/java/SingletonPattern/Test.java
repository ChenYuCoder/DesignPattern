package SingletonPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public class Test {

    public static void main(String[] args) {
        // 单例模式-创建型
        // 保证一个类仅有一个实例，并提供一个访问它的全局访问点
        // 避免一个全局使用的类频繁地创建与销毁。
        // 饿汉式单例：在没有被使用的时候就被创建，某些情况浪费内存
        // 懒汉式单例：使用时被创建，线程不安全
        // 带锁懒汉式单例：增加了锁的懒汉式，效率低
        // 双重验证懒汉式：效率相对低，可以被反射破坏
        // 静态内部类单例：利用了内部类只有在外部类被使用时才会被加载的特性，可以被序列化破坏，增加readResolve方法可以解决
        // 枚举单例：利用枚举的特性（不允许被创建，在使用时加载）实现单例
        HungerSingleton.getInstance().test();
        LazySingleton.getInstance().test();
        LockLazySingleton.getInstance().test();
        DoubleCheckLockSingleton.getInstance().test();
        StaticInnerSingleton.getInstance().test();
        EnumSingleton.INSTANCE.test();
    }

}
