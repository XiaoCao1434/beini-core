package com.beini.authorization.entity;

import lombok.Data;

@Data
public class RoleMenusInfo {
	private int roleMenuId;
	/**
	 * 菜单Id
	 */
	private int  menuId;
	/**
	 * 角色code
	 */
	private String roleCode;
}
