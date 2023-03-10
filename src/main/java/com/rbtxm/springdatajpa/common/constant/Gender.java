package com.rbtxm.springdatajpa.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * @Description: 性别枚举
 * @Author: guanxiangkai
 * @CreatedTime: 2023-03-10 23:21:23:21
 * @Version: 1.0.0
 */
@Getter
@AllArgsConstructor
public enum Gender {
    MAIE("男"),
    FEMAIE("女");
    private String desc;

}
