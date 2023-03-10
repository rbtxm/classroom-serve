package com.rbtxm.springdatajpa.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * @Description: 状态枚举
 * @Author: guanxiangkai
 * @CreatedTime: 2023-03-10 23:34:23:34
 * @Version: 1.0.0
 */
@Getter
@AllArgsConstructor
public enum Status {
    NORMAL("正常"),
    DISABLE("禁用");
    private String desc;
}
