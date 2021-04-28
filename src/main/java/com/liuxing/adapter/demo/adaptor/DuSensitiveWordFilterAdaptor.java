package com.liuxing.adapter.demo.adaptor;

import com.liuxing.adapter.demo.DuSensitiveWordFilter;

/**
 * @ClassName AliSensitiveWordFilterAdaptor
 * @Description 某度适配类
 * @Author liuxing007
 * @Date 2021/4/27 17:52
 */
public class DuSensitiveWordFilterAdaptor implements ISensitiveWordFilter {

    private DuSensitiveWordFilter duSensitiveWordFilter = new DuSensitiveWordFilter();

    @Override
    public String filter(String word) {
        return duSensitiveWordFilter.filterWord(word, "*");
    }
}
