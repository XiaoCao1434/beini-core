package com.beini.core.enums;

import lombok.Getter;

/**
 * 订单状态枚举类
 * @author lb_chen
 * @date 2018-04-17 20:27
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
