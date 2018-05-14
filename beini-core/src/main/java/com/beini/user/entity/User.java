package com.beini.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private String openId;
	private String unionId;
	private String openCode;
	private String status;
}
