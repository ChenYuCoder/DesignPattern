package ProxyPattern.s;

import ProxyPattern.I;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class ProxyB implements I {

    private A a;

    @Override
    public void test() {
        if (a == null) {
            a = new A();
        }
        System.out.println("我是代理B");
        System.out.println("执行前");
        a.test();
        System.out.println("执行后");
    }
}
