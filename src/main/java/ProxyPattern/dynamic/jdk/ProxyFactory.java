package ProxyPattern.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenyu
 * @date 2021/3/22
 * <p>
 * JDK实现
 * <p>
 * 缺点：利用了反射效率较低，被代理类必须实现某接口
 * 底层实现：
 * 1. 获取被代理类的接口，生成接口的实现
 * 2. 在虚拟接口实现中，调用ProxyFactory.invoke方法
 * 3. 在ProxyFactory.invoke实现自定义逻辑，并通过反射调用被代理方法
 */
public class ProxyFactory implements InvocationHandler {

    private Object target;

    public Object buildProxy(Object target) {
        this.target = target;
        return Proxy
          .newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
            this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理：");
        System.out.println("执行前：");
        Object invoke = method.invoke(target, args);
        System.out.println("执行后：");
        return invoke;
    }
}
