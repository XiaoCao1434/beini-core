package com.beini.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum KeyPrefixEnum {
	PRODUCT("PROD","商品信息KEY前缀"),
	PRODUCT_BRAND("PRODB","品牌信息KEY前缀"),
	;
	private String prefix;
	private String message;
	
}
