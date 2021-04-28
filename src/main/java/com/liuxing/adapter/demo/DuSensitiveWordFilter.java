package com.liuxing.adapter.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DuSensitiveWordFilter
 * @Description 某度过滤
 * @Author liuxing007
 * @Date 2021/4/27 16:07
 */
public class DuSensitiveWordFilter {


    private static final List<String> sensitiveWords = new ArrayList<>(3);

    static {
        sensitiveWords.add("爸");
        sensitiveWords.add("妈");
        sensitiveWords.add("爷");

    }

    /**
     * @param word    需要过滤的内容
     * @param repWord 需要替换成什么
     * @return java.lang.String
     * @Description 过滤
     * @Date 2021/4/27 16:34
     */
    public String filterWord(String word, String repWord) {

        if (StringUtils.isAllEmpty(word, repWord)) {
            return null;
        }
        for (String sensitiveWord : sensitiveWords) {
            if (word.indexOf(sensitiveWord) >= 0) {
                System.out.println("找到敏感词：" + sensitiveWord + "，直接替换");
                word = word.replaceAll(sensitiveWord, repWord);
            }
        }
        return word;


    }
}
