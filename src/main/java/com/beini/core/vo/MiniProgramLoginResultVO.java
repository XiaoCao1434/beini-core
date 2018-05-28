package com.beini.core.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MiniProgramLoginResultVO {
	/**
	 * 用户唯一标识
	 */
	private String openid;
	/**
	 * 会话密钥
	 */
	private String session_key;
	/**
	 * 用户在开放平台的唯一标识符
	 */
	private String unionid;
	
	/**
	 * 错误码
	 */
	private Integer errcode;
	/**
	 * 错误信息
	 */
	private String errmsg;
}
