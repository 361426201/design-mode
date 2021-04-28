package com.liuxing.proxy.extend;

/**
 * @ClassName: UserService
 * @Author: 流星007
 * @Description: user login or register
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Date: 2020/8/29 15:10
 * @Version: 1.0
 */

public class UserService {


    /**
     * login in
     * @param username
     * @param password
     */
    public Boolean  login(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return true;
    }
}
