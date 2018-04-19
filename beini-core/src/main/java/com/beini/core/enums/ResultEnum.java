package com.beini.core.enums;

import lombok.Getter;

/**
 * 结果集枚举类
 * @author lb_chen
 * @date 2018-04-17 20:32
 */
@Getter
public enum ResultEnum {
	/*common*/
	SUCCESS(0, "成功"),
    PARAM_ERROR(1, "参数不正确"),
    /*商品属性*/
	PRODUCT_ATTRIBUTE_UPDATE_FAIL(120,"商品属性更新失败"),
	PRODUCT_ATTRIBUTE_INSERT_FAIL(121,"商品属性新增失败"),
	PRODUCT_ATTRIBUTE_DELETE_FAIL(122,"商品属性删除失败"),
	PRODUCT_ATTRIBUTE_NOT_EXIST(123, "商品属性不存在"),
    
	/*商品与属性关联信息*/
    PRODUCT_AND_ATTRIBUTE_UPDATE_FAIL(130,"商品与属性关联信息更新失败"),
	PRODUCT_AND_ATTRIBUTE_INSERT_FAIL(131,"商品与属性关联信息新增失败"),
	PRODUCT_AND_ATTRIBUTE_DELETE_FAIL(132,"商品与属性关联信息删除失败"),
	PRODUCT_AND_ATTRIBUTE_NOT_EXIST(133, "商品与属性关联信息不存在"),
	
	/*商品*/
	PRODUCT_UPDATE_FAIL(140,"商品更新失败"),
	PRODUCT_INSERT_FAIL(141,"商品新增失败"),
	PRODUCT_DELETE_FAIL(142,"商品删除失败"),
	PRODUCT_NOT_EXIST(143, "商品不存在"),
	
	/*品牌*/
	PRODUCT_BRAND_UPDATE_FAIL(150,"品牌更新失败"),
	PRODUCT_BRAND_INSERT_FAIL(151,"品牌新增失败"),
	PRODUCT_BRAND_DELETE_FAIL(152,"品牌删除失败"),
	PRODUCT_BRAND_NOT_EXIST(153, "品牌不存在"),
	PRODUCT_STOCK_ERROR(11, "商品库存不正确"),
	PRODUCT_STATUS_ERROR(24, "商品状态不正确"),
	
    /*订单*/
    ORDER_NOT_EXIST(12, "订单不存在"),
    ORDERDETAIL_NOT_EXIST(13, "订单详情不存在"),
    ORDER_STATUS_ERROR(14, "订单状态不正确"),
    ORDER_UPDATE_FAIL(15, "订单更新失败"),
    ORDER_DETAIL_EMPTY(16, "订单详情为空"),
    ORDER_PAY_STATUS_ERROR(17, "订单支付状态不正确"),
    ORDER_CANCEL_SUCCESS(22, "订单取消成功"),
    ORDER_FINISH_SUCCESS(23, "订单完结成功"),
    ORDER_OWNER_ERROR(19, "该订单不属于当前用户"),
    
    /*购物车*/
    CART_EMPTY(18, "购物车为空"),
    
    /*公众号*/
    WECHAT_MP_ERROR(20, "微信公众账号方面错误"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21, "微信支付异步通知金额校验不通过"),
    
    /*登录登出*/
    LOGIN_FAIL(25, "登录失败, 登录信息不正确"),
    LOGOUT_SUCCESS(26, "登出成功"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
