package com.liuxing.adapter;

/**
 * @ClassName MyAdaptee
 * @Description 与Itarget定义的接口不兼容的类
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Author ymy
 * @Date 2021/4/27 11:14
 */
public class MyAdaptee {

    public void todo1(){
        System.out.println("这是 todo1");

    }

    public void todo2(){
        System.out.println("这是 todo2");
    }

    public void doSomthing3(){
        System.out.println("这是 todo3");
    }
}
