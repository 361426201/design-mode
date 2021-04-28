package com.liuxing.adapter.demo;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName WeiSensitiveWordFilter
 * @Description 某为云过滤
 * @Author ymy
 * @Date 2021/4/27 16:07
 */
public class WeiSensitiveWordFilter {

    private static Map<Integer, String> filterMap = new HashMap<>();

    private static final List<String> sensitiveWords = new ArrayList<>(3);

    static {
        //将敏感词过滤为 *
        filterMap.put(1, "*");
        //将敏感词过滤为空字符串
        filterMap.put(2, "");
        //将敏感词过滤为 -
        filterMap.put(3, "-");


        sensitiveWords.add("干");
        sensitiveWords.add("操");
        sensitiveWords.add("怼");

    }

    /**
     * @param word 需要过滤的内容
     * @param type 需要替换成什么
     * @return java.lang.String
     * @Description 过滤
     * @Date 2021/4/27 16:34
     */
    public String filterWord(String word, Integer type) {

        if (StringUtils.isEmpty(word) || type == null) {
            return null;
        }
        String repWord = filterMap.get(type);
        for (String sensitiveWord : sensitiveWords) {
            if (word.indexOf(sensitiveWord) >= 0) {
                System.out.println("找到敏感词：" + sensitiveWord + "，直接替换");
                word = word.replaceAll(sensitiveWord, repWord);
            }
        }
        return word;

    }
}
