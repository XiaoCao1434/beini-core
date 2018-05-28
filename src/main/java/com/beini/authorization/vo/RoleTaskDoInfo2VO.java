package com.beini.authorization.vo;

import lombok.Data;

@Data
public class RoleTaskDoInfo2VO {
	/**
	 * 序列号
	 */
	private String aab_id;
	private String aac_roleTaskDoCode;
	private String aad_roleTaskCode;
	/**
	 * 名称
	 */
	private String aae_roleTaskName;
	/**
	 * 状态
	 */
	private String aaf_status;
	/**
	 * 用户
	 */
	private String aag_userCode;
	/**
	 * 执行时间
	 */
	private String aah_userDate;
	/**
	 * 穿件时间
	 */
	private String aai_createTime;
	/**
	 * 结束时间
	 */
	private String aaj_endTime;
	private String aak_caozuo;
	
}