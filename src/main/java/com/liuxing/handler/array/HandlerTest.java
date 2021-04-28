package com.liuxing.handler.array;

/**
 * @ClassName HandlerTest
 * @Description
 * @Author ymy
 * @Date 2021/4/28 16:31
 */
public class HandlerTest {

    public static void main(String[] args) {
        ChainHandler chainHandler = new ChainHandler();
        chainHandler.addHandler(new Handler1());
        chainHandler.addHandler(new Handler2());
        chainHandler.addHandler(new Handler3());
        chainHandler.handler();
    }
}
