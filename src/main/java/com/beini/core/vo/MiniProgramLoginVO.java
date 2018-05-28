package com.beini.core.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MiniProgramLoginVO {
	/**
	 * 小程序唯一标识
	 */
	private String appid="wx457c645fe6ef3e1c";
	/**
	 * 小程序的 app secret
	 */
	private String secret="c93df31144ed8cf701d49cd4aabe7165";
	/**
	 * 登录时获取的 code
	 */
	private String jsCode;
	/**
	 * 填写为 authorization_code
	 */
	private String grantType="authorization_code";
	
	public MiniProgramLoginVO(String jsCode) {
		this.jsCode = jsCode;
	}
}
