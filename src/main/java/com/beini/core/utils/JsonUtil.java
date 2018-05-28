package com.beini.core.utils;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Json工具类 <br>
 * <ul>
 * <li>使用gson将对象转换成json字符串</li>
 * <li>使用fastJson将对象转换成json字符串</li>
 * <li>使用fastJson将json字符串转换成对象</li>
 * </ul>
 * 
 * @author lb_chen
 * @date 2018-04-17 20:03
 */
public class JsonUtil {
	/**
	 * 将对象序列化成json字符串
	 * 
	 * @param object
	 *            需要转换成json字符串的对象
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

	/* fastJson处理对象与json的逻辑关系 */
	/**
	 * 将对象转换成json的字符串
	 * 
	 * @param value
	 *            需要转换的对象
	 * @return json字符串
	 */
	public static <T> String beanToString(T value) {
		if (value == null) {
			return null;
		}
		Class<?> clazz = value.getClass();
		if (clazz == int.class || clazz == Integer.class) {
			return "" + value;
		} else if (clazz == long.class || clazz == Long.class) {
			return "" + value;
		} else if (clazz == short.class || clazz == Short.class) {
			return "" + value;
		} else if (clazz == byte.class || clazz == Byte.class) {
			return "" + value;
		} else if (clazz == float.class || clazz == Float.class) {
			return "" + value;
		} else if (clazz == double.class || clazz == Double.class) {
			return "" + value;
		} else if (clazz == char.class || clazz == Character.class) {
			return "" + value;
		} else if (clazz == String.class) {
			return (String) value;
		} else if (clazz == boolean.class || clazz == Boolean.class) {
			return (Boolean) value ? StringUtil.TRUE : StringUtil.FALSE;
		}
		/* 非常见8大类型和String */
		else {
			return JSON.toJSONString(value);
		}
	}

	/**
	 * 将需要转换成对象的json字符串转换成对象
	 * 
	 * @param str
	 *            需要转换成对象的json字符串
	 * @param clazz
	 *            对象的class
	 * @return class实例化后的对象
	 */
	@SuppressWarnings("unchecked")
	public static <T> T stringToBean(String str, Class<T> clazz) {
		if (str == null || str.length() <= 0 || clazz == null) {
			return null;
		}
		if (clazz == int.class || clazz == Integer.class) {
			return (T) Integer.valueOf(str);
		} else if (clazz == long.class || clazz == Long.class) {
			return (T) Long.valueOf(str);
		} else if (clazz == byte.class || clazz == Byte.class) {
			return (T) Byte.valueOf(str);
		} else if (clazz == short.class || clazz == Short.class) {
			return (T) Short.valueOf(str);
		} else if (clazz == float.class || clazz == Float.class) {
			return (T) Float.valueOf(str);
		} else if (clazz == short.class || clazz == Double.class) {
			return (T) Double.valueOf(str);
		} else if (clazz == char.class || clazz == Character.class) {
			return (T) Character.valueOf(str.charAt(0));
		} else if (clazz == boolean.class || clazz == Boolean.class) {
			if ("".equals(str) || StringUtil.BLANK.equals(str) || StringUtil.ZERO.equals(str)
					|| StringUtil.FALSE.equalsIgnoreCase(str)) {
				return (T) Boolean.FALSE;
			} else {
				return (T) Boolean.TRUE;
			}
		} else if (clazz == String.class) {
			return (T) str;
		}
		/* 非常见8大类型和String */
		else {
			return JSON.toJavaObject(JSON.parseObject(str), clazz);
		}
	}
}
