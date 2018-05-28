package com.beini.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="beini_role_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BeiniRoleMenu {
	@Id
    private Integer roleMenuId;

    private Integer menuId;

    private String roleCode;

}