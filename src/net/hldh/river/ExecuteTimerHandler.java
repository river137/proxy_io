package net.hldh.river;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liuhj on 2015/12/1.
 */
public class ExecuteTimerHandler implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println(method.getName() + ":" + (end - start));
        return null;
    }
}
