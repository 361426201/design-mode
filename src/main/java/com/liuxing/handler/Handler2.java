package com.liuxing.handler;

/**
 * @ClassName: Handler1
 * @Author: 流星007
 * @Description: 处理器1
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Version: 1.0
 */
public class Handler2 extends Handler {
    @Override
    public boolean doHandler() {
        System.out.println("这是第二个handler，无法解决此问题，请求下一个处理器处理");
        return false;
    }
}
