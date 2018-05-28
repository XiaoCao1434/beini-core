package com.beini.core.enums;

import lombok.Getter;

/**
 * 支付状态枚举类
 * @author lb_chen
 * @date 2018-04-17 20:28
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
