package com.liuxing.adapter.demo.adaptor;

import com.liuxing.adapter.demo.WeiSensitiveWordFilter;

/**
 * @ClassName AliSensitiveWordFilterAdaptor
 * @Description 某为适配类
 * @Author liuxing007
 * @Date 2021/4/27 17:52
 */
public class WuiSensitiveWordFilterAdaptor implements ISensitiveWordFilter {
    private final WeiSensitiveWordFilter weiSensitiveWordFilter = new WeiSensitiveWordFilter();


    @Override
    public String filter(String word) {
        return weiSensitiveWordFilter.filterWord(word, 1);
    }
}
