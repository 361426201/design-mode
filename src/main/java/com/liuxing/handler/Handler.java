package com.liuxing.handler;

/**
 * @ClassName Handler
 * @Description
 * @Author ymy
 * @Date 2021/4/28 16:19
 */
public abstract class Handler {

    /**
     * 下一个处理器
     */
    protected Handler nextHandler = null;

    /**
     * 设置下一个处理器
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void handler(){
        boolean flag = doHandler();
        if(!flag && nextHandler!= null){
            nextHandler.handler();
        }
    }

    /**
     * 处理器处理请求
     */
    protected abstract boolean doHandler();

}
