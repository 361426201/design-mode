package com.liuxing.adapter.demo;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName FilterWordVo
 * @Description 敏感词过滤参数
 * @Author liuxing007
 * @Date 2021/4/27 16:09
 */
@Data
@Builder
public class FilterWordVo {

    /**
     *需要替换的内容
     */
    private String word;

    /**
      *替换成什么
     */
    private String repWord;
}
