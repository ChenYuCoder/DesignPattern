package ProxyPattern.dynamic.jdk;

import ProxyPattern.M;

/**
 * @author chenyu
 * @date 2021/3/22
 */
public class E implements M {

    @Override
    public void test() {
        System.out.println("E：做了一些事情");
    }
}
