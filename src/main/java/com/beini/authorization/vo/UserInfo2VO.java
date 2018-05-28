package com.beini.authorization.vo;

import lombok.Data;

@Data
public class UserInfo2VO {
	/**
	 * checkbox
	 */
	private String aaa_Index;
	/**
	 * 序列号
	 */
	private int aab_id;
	/**
	 * 用户code
	 */
	private String aac_userCode;
	/**
	 * 机构
	 */
	private String aaca_org;
	/**
	 * 用户code
	 */
	private String aacb_yunBiaoUserCode;
	/**
	 * 登录名
	 */
	private String aad_userName;
	/**
	 * 昵称
	 */
	private String aae_nickName;
	/**
	 * 邮件
	 */
	private String aaf_email;
	/**
	 * 手机
	 */
	private String aag_userMobile;
	/**
	 * 电话
	 */
	private String aah_userPhone;
	/**
	 * 用户类型，0为平台创建，1 用户创建
	 */
	private String aai_userType;
	/**
	 * 0为冻结1为激活
	 */
	private String aaj_userStatus;
	/**
	 * 操作
	 */
	private String aak_caozuo;
}