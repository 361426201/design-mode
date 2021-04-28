package com.liuxing.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: demo
 * @Package: com.ymy.proxy
 * @ClassName: dynamicUserUserProxy
 * @Author: 流星007
 * @Description: dynamic User proxy
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Date: 2020/8/30 13:33
 * @Version: 1.0
 */
public class DynamicUserUserProxy {

    public Object createProxy(Object object) {
        Class[] interfaces = object.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), interfaces, handler);
    }


    private class DynamicProxyHandler implements InvocationHandler {

        private Object object;

        public DynamicProxyHandler(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTime = System.currentTimeMillis();
            Object result = method.invoke(object, args);
            long endTime = System.currentTimeMillis();
            System.out.println("login time : " + (endTime - startTime) +" ms" );
            return result;
        }
    }

}
