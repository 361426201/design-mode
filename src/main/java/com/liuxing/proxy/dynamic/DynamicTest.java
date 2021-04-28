package com.liuxing.proxy.dynamic;


/**
 * @ClassName: DynamicTest
 * @Author: 流星007
 * @Description: Dynamic Test
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Date: 2020/8/30 13:36
 * @Version: 1.0
 */
public class DynamicTest {

    public static void main(String[] args) {

        DynamicUserUserProxy proxy = new DynamicUserUserProxy();

        IUserService userService = (IUserService) proxy.createProxy(new UserService());
        Boolean login = userService.login("zhangsan", "123456");
        System.out.println("login result :" +login);
    }
}
