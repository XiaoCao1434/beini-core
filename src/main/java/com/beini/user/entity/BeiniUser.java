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
@Table(name="beini_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BeiniUser {
	@Id
    private String userCode;

    private Integer id;

    private String userName;

    private String userPassword;

    private String yunbiaoUserCode;

    private String yunbiaoUserPassword;

    private String nickName;

    private String email;

    private String userMobile;

    private String userPhone;

    private Integer userType;

    private Integer userStatus;

    private String userHeader;

    private Date createTime;

    private String createAccount;

    private Date updateTime;

    private String updateAccount;
}