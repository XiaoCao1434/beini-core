package com.beini.authorization.entity;

import lombok.Data;

@Data
public class UserRoleInfo{
	/**
	 * 用户角色关联ID
	 */
	private int  userRoleId;
	/**
	 * 角色code
	 */
	private String userCode;
	/**
	 * 角色名称
	 */
	private String roleCode;
}
