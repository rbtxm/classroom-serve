package com.rbtxm.springdatajpa.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * @Description: 删除状态枚举
 * @Author: guanxiangkai
 * @CreatedTime: 2023-03-10 23:39:23:39
 * @Version: 1.0.0
 */
@Getter
@AllArgsConstructor
public enum DelFlag {
    NORMAL("正常"),
    DELETE("删除");
    private String desc;
}
