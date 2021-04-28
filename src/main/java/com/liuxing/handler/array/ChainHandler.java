package com.liuxing.handler.array;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ChainHandler
 * @Author: 流星007
 * @Description: 处理器链
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Version: 1.0
 */
public class ChainHandler {
    /**
     * 所有的处理器
     */
    private List<IHandler> list = new ArrayList<IHandler>();

    /**
     * 添加处理器
     * @param handler
     */
    public void addHandler(IHandler handler){
        list.add(handler);
    }

    /**
     * 开始执行handler
     */
    public void handler(){
        if(CollectionUtils.isEmpty(list)){
            return ;
        }
        for(IHandler handler: list){
            if(handler.handler()){
                return;
            }
        }
    }
}
