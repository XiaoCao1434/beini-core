package com.beini.core.utils;

import java.util.Random;

import com.beini.core.enums.KeyPrefixEnum;

/**
 * 唯一码生成器
 * @author lb_chen
 * @date 2018-04-17 20:08
 */
public class KeyUtil {

    /**
     * 生成唯一的主键<br>
     * 格式: 13位时间+6位随机数
     * @return 格式如下：1523966797678685750(19位)
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
    /**
     * 生成唯一的主键<br>
     * 格式: key前缀+13位时间+6位随机数
     * @return 格式如下：prod1523966797678685750(19位)
     */
    public static synchronized String genUniqueKey(KeyPrefixEnum keyPrefixEnum) {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return keyPrefixEnum.getPrefix()+System.currentTimeMillis() + String.valueOf(number);
    }
}
