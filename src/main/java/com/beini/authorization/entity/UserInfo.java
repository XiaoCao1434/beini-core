package com.beini.authorization.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserInfo extends BaseInfo{
	/**
	 * 序列号
	 */
	@Id
	@GeneratedValue
	private Integer id;
	/**
	 * 用户code
	 */
	private String userCode;
	/**
	 * 登录名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String userPassword;
	/**
	 * 云表code	
	 */
	private String yunBiaoUserCode;
	/**
	 * 云表密码
	 */
	private String yunBiaoUserPassword;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 邮件
	 */
	private String email;
	/**
	 * 手机
	 */
	private String userMobile;
	/**
	 * 电话
	 */
	private String userPhone;
	/**
	 * 用户类型:0为平台创建，1 用户创建
	 */
	private int userType;
	/**
	 * 用户状态:0为冻结1为激活
	 */
	private int userStatus;
	/**
	 * 头像
	 */
	private String userHeader;
	/**
	 * 角色列表
	 */
	private String roleListStr;
	/**
	 * 机构
	 */
	private String organizationType;
	
}