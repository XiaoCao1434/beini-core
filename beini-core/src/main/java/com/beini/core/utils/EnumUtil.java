package com.beini.core.utils;

import com.beini.core.enums.CodeEnum;

/**
 * 枚举工具类
 * @author lb_chen
 * @date 2018-04-17 20:00
 */
public class EnumUtil {
	/**
	 * 通过code查找对应枚举类中code对应的整个对象
	 * @param code 枚举code编码
	 * @param enumClass 枚举类class
	 * @return 整个枚举类对象
	 */
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
