package com.liuxing.proxy.ombination;

/**
 * @ClassName: UserServiceProxy
 * @Author: 流星007
 * @Description: user proxy
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Date: 2020/8/29 15:29
 * @Version: 1.0
 */
public class UserServiceProxy implements  IUserService{

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Boolean login(String username, String password) {
        long startTime = System.currentTimeMillis();
        Boolean login = userService.login(username, password);
        long endTime = System.currentTimeMillis();
        System.out.println("login time : " + (endTime - startTime) +" ms" );
        return login;
    }
}
