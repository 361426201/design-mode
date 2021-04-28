package com.liuxing.adapter.demo.adaptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AdaptorManagent
 * @Description 适配器管理
 * @Author liuxing007
 * @Date 2021/4/27 17:57
 */
public class AdaptorManagent {

    private List<ISensitiveWordFilter> sensitiveWordFilters = new ArrayList<>();

    public void addAdaptor(ISensitiveWordFilter sensitiveWordFilter) {
        sensitiveWordFilters.add(sensitiveWordFilter);
    }

    public String filter(String word){
        for(ISensitiveWordFilter sensitiveWordFilter: sensitiveWordFilters){
            word = sensitiveWordFilter.filter(word);
        }
        return word;
    }

}
