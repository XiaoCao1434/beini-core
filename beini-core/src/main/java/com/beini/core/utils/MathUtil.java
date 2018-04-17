package com.beini.core.utils;

/**
 * 数字工具类
 * @author lb_chen
 * @date 2018-04-17 20:14
 */
public class MathUtil {
	/**
	 * 金额的最小度量单位
	 */
    private static final Double MONEY_RANGE = 0.01;

    /**
     * 比较2个金额是否相等
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        }else {
            return false;
        }
    }
}
