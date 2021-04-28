package com.liuxing.handler;

/**
 * @ClassName: Handler1
 * @Author: 流星007
 * @Description: 处理器1
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Version: 1.0
 */
public class Handler3 extends Handler {
    @Override
    public boolean doHandler() {
        boolean flag = true;
        System.out.println("这是第三个handler，问题解决，无需在往下执行");
        if(flag){
            return true;
        }
        System.out.println("执行结束，没有处理器能够解决这个请求");
        return false;
    }
}
