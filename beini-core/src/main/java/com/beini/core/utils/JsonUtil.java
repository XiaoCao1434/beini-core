package com.beini.core.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * gson工具类
 * @author lb_chen
 * @date 2018-04-17 20:03
 */
public class JsonUtil {
	/**
	 * 将对象序列化成json字符串
	 * @param object 需要转换成json字符串的对象
	 * @return json字符串
	 */
    public static String toJson(Object object) {
    	/**
    	 * 实例化出一个gson构造器
    	 */
        GsonBuilder gsonBuilder = new GsonBuilder();
        /**
         * json字符串美化
         */
        gsonBuilder.setPrettyPrinting();
        /**
         * 实例化出一个gson对象
         */
        Gson gson = gsonBuilder.create();
        /**
         * 对象转json字符串
         */
        return gson.toJson(object);
    }
}
