package com.liuxing.adapter.demo.normal;

import com.liuxing.adapter.demo.AliSensitiveWordFilter;
import com.liuxing.adapter.demo.DuSensitiveWordFilter;
import com.liuxing.adapter.demo.FilterWordVo;
import com.liuxing.adapter.demo.WeiSensitiveWordFilter;

/**
 * @ClassName SensitiveWordFilterService
 * @Description 敏感词过滤处理
 * @Author liuxing007
 * @Date 2021/4/27 17:28
 */
public class SensitiveWordFilterService {

    private AliSensitiveWordFilter aliSensitiveWordFilter = new AliSensitiveWordFilter();
    private DuSensitiveWordFilter duSensitiveWordFilter = new DuSensitiveWordFilter();
    private WeiSensitiveWordFilter weiSensitiveWordFilter = new WeiSensitiveWordFilter();


    public String filter(String word) {
        FilterWordVo filterWordVo = FilterWordVo.builder().word(word).repWord("*").build();
        word = aliSensitiveWordFilter.filterWord(filterWordVo);
        word = duSensitiveWordFilter.filterWord(word, "*");
        word = weiSensitiveWordFilter.filterWord(word, 1);
        return word;
    }


}
