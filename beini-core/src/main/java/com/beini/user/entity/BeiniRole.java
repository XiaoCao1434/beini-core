package com.beini.user.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="beini_role")
public class BeiniRole {
	@Id
	private Integer roleId;
	private String roleCode;
    private String roleName;

    private String roleDesc;

    private Integer status;

    private String createAccount;

    private Date createTime;

    private String updateAccount;

    private Date updateTime;

}