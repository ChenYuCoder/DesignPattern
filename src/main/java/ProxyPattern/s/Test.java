package ProxyPattern.s;

/**
 * @author chenyu
 * @date 2021/3/24
 */
public class Test {

    public static void main(String[] args) {
        // 代理模式-结构型
        // 为其他对象提供一种代理以控制对这个对象的访问
        // 在不改变某类原对象代码的情况，统一增加逻辑
        // 静态代理：类似装饰器模式，一对一代理
        // 动态代理：统一代理一类对象，在执行前和后增加逻辑
        // 动态代理-JDK实现：需要被代理对象实现接口，Proxy.newProxyInstance()方法增加代理实现到classLoader中，可以查看代理实现的源码
        // 动态代理-cglib实现：被代理对象做为父类，生成代理子类，在子类中调用父类响应方法
        A a = new A();
        a.test();
        ProxyB proxyB = new ProxyB();
        proxyB.test();
    }

}
