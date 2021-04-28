package com.liuxing.adapter.demo.adaptor;

import com.liuxing.adapter.demo.AliSensitiveWordFilter;
import com.liuxing.adapter.demo.FilterWordVo;

/**
 * @ClassName AliSensitiveWordFilterAdaptor
 * @Description 某里云适配类
 * @Author liuxing007
 * @Date 2021/4/27 17:52
 */
public class AliSensitiveWordFilterAdaptor implements ISensitiveWordFilter {

    private AliSensitiveWordFilter aliSensitiveWordFilter = new AliSensitiveWordFilter();

    @Override
    public String filter(String word) {
        FilterWordVo filterWordVo = FilterWordVo.builder().word(word).repWord("*").build();
        return aliSensitiveWordFilter.filterWord(filterWordVo);
    }
}
