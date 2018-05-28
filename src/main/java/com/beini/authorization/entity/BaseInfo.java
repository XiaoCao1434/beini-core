package com.beini.authorization.entity;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BaseInfo {
	private Timestamp createTime;
	private String createAccount;
	private Timestamp updateTime;
	private String updateAccount;
}
