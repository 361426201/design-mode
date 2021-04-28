package com.liuxing.adapter.demo.normal;


/**
 * @ClassName Test
 * @Description 敏感词过滤测试
 * @Author liuxing007
 * @Date 2021/4/27 16:38
 */
public class Test {


    public static void main(String[] args) {
        SensitiveWordFilterService sensitiveWordFilterService = new SensitiveWordFilterService();
        String word = sensitiveWordFilterService.filter("你就是一个垃圾，这么菜，你妈妈没教你打游戏吗？干");
        System.out.println("过滤后的内容：" + word);
    }


}
