package ProxyPattern.dynamic.jdk;

import ProxyPattern.M;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class D implements M {

    @Override
    public void test() {
        System.out.println("D：做了一些事情");
    }
}
