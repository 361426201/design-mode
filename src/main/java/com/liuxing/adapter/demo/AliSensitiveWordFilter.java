package com.liuxing.adapter.demo;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AliSensitiveWordFilter
 * @Description 某里云过滤
 * @Author liuxing007
 * @Date 2021/4/27 16:07
 */
public class AliSensitiveWordFilter {

    private static final List<String> sensitiveWords = new ArrayList<>(3);

    static {
        sensitiveWords.add("垃圾");
        sensitiveWords.add("废物");
        sensitiveWords.add("滚");

    }


    /**
     * @param filterWordVo
     * @return java.lang.String
     * @Description 过滤
     * @Date 2021/4/27 16:34
     */
    public String filterWord(FilterWordVo filterWordVo) {
        if (ObjectUtils.isEmpty(filterWordVo)) {
            return null;
        }
        String repWord = filterWordVo.getRepWord();
        String word = filterWordVo.getWord();
        for (String sensitiveWord : sensitiveWords) {
            if (word.indexOf(sensitiveWord) >= 0) {
                System.out.println("找到敏感词：" + sensitiveWord + "，直接替换");
                word = word.replaceAll(sensitiveWord, repWord);
            }
        }
        return word;
    }
}
