package com.beini.order.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 购物车表
 * 
 * @author lb_chen
 * @Date 2018-04-08 11:42
 * @Order 20
 */
@Entity
@Table(comment = "购物车表", appliesTo = "shoppingcart")
public class Shoppingcart implements Serializable {
	private static final long serialVersionUID = -2815149195927873485L;
	/**
	 * 订单明细编码
	 */
	@Id
	@Column(columnDefinition = "int(11) COMMENT '订单明细编码'")
	private Integer id;
	/**
	 * 用户编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '用户编码'")
	private String openId;
	/**
	 * 商品编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '商品编码'")
	private String proUuid;
	/**
	 * 是否有效
	 */
	@Column(columnDefinition = "char(1) COMMENT '是否有效'")
	private boolean isProductExists;
	/**
	 * 购买数量
	 */
	@Column(columnDefinition = "double COMMENT '购买数量'")
	private double number;
	/**
	 * 创建时间
	 */
	@Column(columnDefinition = "datetime COMMENT '创建时间'")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProUuid() {
		return proUuid;
	}

	public void setProUuid(String proUuid) {
		this.proUuid = proUuid;
	}

	public boolean isProductExists() {
		return isProductExists;
	}

	public void setProductExists(boolean isProductExists) {
		this.isProductExists = isProductExists;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
