package ProxyPattern.dynamic.jdk;

import ProxyPattern.I;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class A implements I {

    @Override
    public void test() {
        System.out.println("A：做了一些事情");
    }
}
