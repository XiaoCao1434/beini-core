package com.beini.core.enums;

import lombok.Getter;

/**
 * 商品状态枚举类
 * @author lb_chen
 * @date 2018-04-17 20:29
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
