package com.beini.authorization.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class AuthorityInfo{
	@Id
	private String authCode;
	private String authObjCode;
	private String authObjType;
	private String roleCode;
	private Timestamp createTime;
	private String createAccount;
}
