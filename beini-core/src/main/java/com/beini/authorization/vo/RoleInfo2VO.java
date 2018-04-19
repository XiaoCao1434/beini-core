package com.beini.authorization.vo;

import lombok.Data;

@Data
public class RoleInfo2VO {
	/**
	 * checkbox
	 */
	private String aaa_Index;
	/**
	 * 序列号
	 */
	private int aab_id;
	/**
	 * 角色code
	 */
	private String aac_roleCode;
	/**
	 * 角色名
	 */
	private String aad_roleName;
	/**
	 * 角色描述
	 */
	private String aae_roleDesc;
	/**
	 * 邮件
	 */
	private String aaf_status;
	/**
	 * 操作
	 */
	private String aak_caozuo;
}