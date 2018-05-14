package com.beini.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="beini_user_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BeiniUserRole {
	@Id
    private Integer userRoleId;

    private String userCode;

    private String roleCode;

}