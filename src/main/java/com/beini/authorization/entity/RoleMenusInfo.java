package com.beini.authorization.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class RoleMenusInfo {
	@Id
	@GeneratedValue
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
