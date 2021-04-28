package com.liuxing.handler;

/**
 * @ClassName: ChainHandler
 * @Author: 流星007
 * @Description: 处理器链
 * csdn：https://blog.csdn.net/qq_33220089
 * 今日头条：https://www.toutiao.com/c/user/5372182357/#mid=1637641735275523
 * @Version: 1.0
 */
public class ChainHandler {
    //第一个处理器
    private Handler firstHandler;
    //最后一个处理器
    private Handler endHandler;

    /**
     * 添加处理器
     * @param handler
     */
    public void addHandler(Handler handler){
        //将当前处理器的下一个处理器设置为null，这一步也可以省略
        handler.setNextHandler(null);
        //判断是不是第一个处理器，如果是第一个处理器，那么将firstHandler和endHandler都设置为：handler
        if(firstHandler == null ){
            firstHandler = handler;
            endHandler = handler;
            return ;
        }
        //如果不是第一个处理器，那么将当前处理器添加到之前最后一个处理器的下一个处理器中
        endHandler.setNextHandler(handler);
        //将最后一个处理器修改为当前添加的这个处理器
        endHandler = handler;
    }

    /**
     * 开始执行handler
     */
    public void handler(){
        if(firstHandler == null ){
            return ;
        }
        firstHandler.handler();
    }


}
