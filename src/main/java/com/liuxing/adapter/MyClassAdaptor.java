package com.liuxing.adapter;

/**
 * @ClassName MyAdaptor
 * @Description 适配器，将原本不兼容Itarget的接口转化为兼容Itarget的接口
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Author ymy
 * @Date 2021/4/27 11:20
 */
public class MyClassAdaptor extends MyAdaptee implements ITarget {

    @Override
    public void doSomthing1() {
        super.todo1();
    }

    @Override
    public void doSomthing2() {
        System.out.println("我是被重新实现的dosomthing2");
    }

}
