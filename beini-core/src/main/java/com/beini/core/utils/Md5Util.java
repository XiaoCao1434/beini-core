package com.beini.core.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Util {
	public static String getMD5(String content) {
		return DigestUtils.md5Hex(content.getBytes());
	}
}
