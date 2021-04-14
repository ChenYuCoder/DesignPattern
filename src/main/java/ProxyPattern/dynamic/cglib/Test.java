package ProxyPattern.dynamic.cglib;

/**
 * @author chenyu
 * @date 2021/3/24
 */
public class Test {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        ProxyFactory proxyFactory2 = new ProxyFactory();
        Object proxyA = proxyFactory.buildProxy(A.class);
        Object proxyD = proxyFactory2.buildProxy(D.class);
        ((A) proxyA).test();
        ((D) proxyD).test();
    }

}
