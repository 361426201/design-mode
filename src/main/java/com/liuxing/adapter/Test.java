package com.liuxing.adapter;

import com.sun.corba.se.spi.oa.ObjectAdapter;

/**
 * @ClassName Test
 * @Description 测试
 * @Author: 流星007
 * @Date 2021/4/27 13:56
 */
public class Test {

    public static void main(String[] args) {

        //类适配器
        ITarget classAdaptor = new MyClassAdaptor();
        classAdaptor.doSomthing1();
        classAdaptor.doSomthing2();
        classAdaptor.doSomthing3();

        System.out.println("============================");

        //对象适配器
        ITarget objectAdaptor = new MyObjectAdaptor(new MyAdaptee());
        objectAdaptor.doSomthing1();
        objectAdaptor.doSomthing2();
        objectAdaptor.doSomthing3();
    }
}
