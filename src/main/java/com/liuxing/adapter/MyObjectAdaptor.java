package com.liuxing.adapter;

/**
 * @ClassName MyObjectAdaptor
 * @Description 适配器，对象适配器
 * @Author: 流星007
 * @Date 2021/4/27 14:08
 */
public class MyObjectAdaptor implements ITarget {

    private MyAdaptee myAdaptee;

    public MyObjectAdaptor(MyAdaptee myAdaptee) {
        this.myAdaptee = myAdaptee;
    }

    @Override
    public void doSomthing1() {
        //交给 MyAdaptee 实现
        myAdaptee.todo1();
    }

    @Override
    public void doSomthing2() {
        System.out.println("我是被重新实现的dosomthing2");
    }

    @Override
    public void doSomthing3() {
        myAdaptee.doSomthing3();
    }
}
