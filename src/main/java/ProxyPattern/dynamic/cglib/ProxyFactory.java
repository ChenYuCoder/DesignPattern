package ProxyPattern.dynamic.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author chenyu
 * @date 2021/3/22
 * <p>
 * cglib实现
 * <p>
 * 缺点：非原生，需要引用第三方
 * 底层实现：
 * 1. 获取被代理类，生成代理类的子类
 * 2. 重写父类方法，在子类中调用ProxyFactory.intercept
 * 3. 在ProxyFactory.intercept实现自定义逻辑，并通过反射调用被代理方法
 */
public class ProxyFactory implements MethodInterceptor {


    public Object buildProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
        System.out.println("动态代理：");
        System.out.println("执行前：");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("执行后：");
        return result;
    }
}
