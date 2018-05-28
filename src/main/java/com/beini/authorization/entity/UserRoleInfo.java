package com.beini.authorization.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserRoleInfo{
	/**
	 * 用户角色关联ID
	 */
	@Id
	@GeneratedValue
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
