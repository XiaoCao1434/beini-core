package com.beini.authorization.entity;

import java.sql.Timestamp;

import lombok.Data;
@Data
public class AuthorityInfo{
	private String authCode;
	private String authObjCode;
	private String authObjType;
	private String roleCode;
	private Timestamp createTime;
	private String createAccount;
}
