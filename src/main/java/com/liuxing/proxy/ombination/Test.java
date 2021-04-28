package com.liuxing.proxy.ombination;

/**
 * @ClassName: Test
 * @Author: 流星007
 * @Description: test
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Date: 2020/8/29 15:15
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserService());
        Boolean login = userServiceProxy.login("zhgnsan", "123456");
        System.out.println("login result : " +login);
    }
}
