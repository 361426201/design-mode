package com.liuxing.adapter.demo.adaptor;

/**
 * @ClassName AdaptorTest
 * @Description 测试
 * @Author ymy
 * @Date 2021/4/27 18:01
 */
public class AdaptorTest {

    public static void main(String[] args) {
        AdaptorManagent adaptorManagent = new AdaptorManagent();
        adaptorManagent.addAdaptor(new AliSensitiveWordFilterAdaptor());
        adaptorManagent.addAdaptor(new DuSensitiveWordFilterAdaptor());
        adaptorManagent.addAdaptor(new WuiSensitiveWordFilterAdaptor());

        String word = adaptorManagent.filter("你就是一个垃圾，这么菜，你妈妈没教你打游戏吗？干");
        System.out.println("过滤后的内容：" + word);
    }

}
