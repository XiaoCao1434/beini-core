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
    /*登录登出*/
    LOGIN_FAIL(25, "登录失败, 登录信息不正确"),
    LOGOUT_SUCCESS(26, "登出成功"), 
    USERNAME_OR_PASSWORD_ERROR(27,"用户名或密码错误"),
    TOKEN_FAILED(28,"访问令牌错误或失效"),
    
    /*商品库存*/
	PRODUCT_STOCK_ERROR(100, "商品库存不正确"),
	
	/*商品统计*/
	PRODUCT_STATISTICS_UPDATE_FAIL(110,"商品统计更新失败"),
	PRODUCT_STATISTICS_INSERT_FAIL(111,"商品统计新增失败"),
	PRODUCT_STATISTICS_DELETE_FAIL(112,"商品统计删除失败"),
	PRODUCT_STATISTICS_NOT_EXIST(113, "商品统计不存在"),
	
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
	PRODUCT_STATUS_ERROR(144, "商品状态不正确"),
	
	/*品牌*/
	PRODUCT_BRAND_UPDATE_FAIL(150,"品牌更新失败"),
	PRODUCT_BRAND_INSERT_FAIL(151,"品牌新增失败"),
	PRODUCT_BRAND_DELETE_FAIL(152,"品牌删除失败"),
	PRODUCT_BRAND_NOT_EXIST(153, "品牌不存在"),
	
	/*商品类别*/
	PRODUCT_CATEGORY_UPDATE_FAIL(160,"商品类别更新失败"),
	PRODUCT_CATEGORY_INSERT_FAIL(161,"商品类别新增失败"),
	PRODUCT_CATEGORY_DELETE_FAIL(162,"商品类别删除失败"),
	PRODUCT_CATEGORY_NOT_EXIST(163, "商品类别不存在"),
	
	/*商品描述*/
	PRODUCT_DESCRIPPTION_UPDATE_FAIL(170,"商品类别更新失败"),
	PRODUCT_DESCRIPPTION_INSERT_FAIL(171,"商品类别新增失败"),
	PRODUCT_DESCRIPPTION_DELETE_FAIL(172,"商品类别删除失败"),
	PRODUCT_DESCRIPPTION_NOT_EXIST(173, "商品类别不存在"),
	
	/*商品图片*/
	PRODUCT_IMAGE_UPDATE_FAIL(180,"商品类别更新失败"),
	PRODUCT_IMAGE_INSERT_FAIL(181,"商品类别新增失败"),
	PRODUCT_IMAGE_DELETE_FAIL(182,"商品类别删除失败"),
	PRODUCT_IMAGE_NOT_EXIST(183, "商品类别不存在"),
	
	/*商品规格*/
	PRODUCT_SPECIFICATION_UPDATE_FAIL(190,"商品规格更新失败"),
	PRODUCT_SPECIFICATION_INSERT_FAIL(191,"商品规格新增失败"),
	PRODUCT_SPECIFICATION_DELETE_FAIL(192,"商品规格删除失败"),
	PRODUCT_SPECIFICATION_NOT_EXIST(193, "商品规格不存在"),

	/*订单*/
	ORDER_UPDATE_FAIL(200,"订单更新失败"),
	ORDER_INSERT_FAIL(201,"订单新增失败"),
	ORDER_DELETE_FAIL(202,"订单删除失败"),
	ORDER_NOT_EXIST(203, "订单不存在"),
	ORDER_STATUS_ERROR(204, "订单状态不正确"),
    ORDER_CANCEL_SUCCESS(205, "订单取消成功"),
    ORDER_FINISH_SUCCESS(206, "订单完结成功"),
    ORDER_OWNER_ERROR(207, "该订单不属于当前用户"),
	
	 /*订单详情*/
	ORDER_DETAIL_UPDATE_FAIL(210,"订单更新失败"),
	ORDER_DETAIL_INSERT_FAIL(211,"订单新增失败"),
	ORDER_DETAIL_DELETE_FAIL(212,"订单删除失败"),
	ORDER_DETAIL_NOT_EXIST(213, "订单详情不存在"),
	ORDER_DETAIL_EMPTY(214, "订单详情为空"),
	
    /*订单支付*/
    ORDER_PAY_STATUS_ERROR(220, "订单支付状态不正确"),
    
    /*购物车*/
    CART_EMPTY(230, "购物车为空"),
    
    /*公众号*/
    WECHAT_MP_ERROR(300, "微信公众账号方面错误"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(301, "微信支付异步通知金额校验不通过"),
    
    
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
