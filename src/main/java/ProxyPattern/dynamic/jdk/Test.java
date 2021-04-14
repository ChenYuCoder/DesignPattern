package ProxyPattern.dynamic.jdk;

import ProxyPattern.I;
import ProxyPattern.M;
import java.io.FileOutputStream;
import sun.misc.ProxyGenerator;

/**
 * @author chenyu
 * @date 2021/3/24
 */
public class Test {

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        D d = new D();
        E e = new E();
        ProxyFactory proxyFactory1 = new ProxyFactory();
        ProxyFactory proxyFactory2 = new ProxyFactory();
        ProxyFactory proxyFactory3 = new ProxyFactory();
        ProxyFactory proxyFactory4 = new ProxyFactory();
        Object proxyA = proxyFactory1.buildProxy(a);
        Object proxyC = proxyFactory2.buildProxy(c);
        Object proxyD = proxyFactory3.buildProxy(d);
        Object proxyE = proxyFactory4.buildProxy(e);
        ((I) proxyA).test();
        ((I) proxyC).test();
        ((M) proxyD).test();
        ((M) proxyE).test();

        //将代理类输出到文件
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{I.class});
        try (FileOutputStream os = new FileOutputStream("$Proxy0.class")) {
            os.write(bytes);
            os.flush();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
