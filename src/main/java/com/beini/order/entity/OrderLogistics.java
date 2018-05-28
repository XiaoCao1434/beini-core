package com.beini.order.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 订单物流表
 * 
 * @author lb_chen
 * @Date 2018-04-08 11:53
 * @Order 20
 */
@Entity
@Table(comment="订单物流表", appliesTo = "order_logistics")
public class OrderLogistics implements Serializable {
	private static final long serialVersionUID = -1678313364134713544L;
	/**
	 * 订单物流编码
	 */
	@Id
	@Column(columnDefinition = "varchar(255) COMMENT '订单物流编码'")
	private String orderLogUuid;
	/**
	 * 订单编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '订单编码'")
	private String orderUuid;
	/**
	 * 物流单号
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '物流单号'")
	private String expressNo;
	/**
	 * 收货人姓名
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货人姓名'")
	private String consigneeRealname;
	/**
	 * 收货人电话
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货人电话'")
	private String consigneeTelphone;
	/**
	 * 收货人备用电话
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货人备用电话'")
	private String consigneeTelphone2;
	/**
	 * 收货地址
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货地址'")
	private String consigneeAddress;
	/**
	 * 邮政编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '邮政编码'")
	private String zip;

	public String getOrderLogUuid() {
		return orderLogUuid;
	}

	public void setOrderLogUuid(String orderLogUuid) {
		this.orderLogUuid = orderLogUuid;
	}

	public String getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getConsigneeRealname() {
		return consigneeRealname;
	}

	public void setConsigneeRealname(String consigneeRealname) {
		this.consigneeRealname = consigneeRealname;
	}

	public String getConsigneeTelphone() {
		return consigneeTelphone;
	}

	public void setConsigneeTelphone(String consigneeTelphone) {
		this.consigneeTelphone = consigneeTelphone;
	}

	public String getConsigneeTelphone2() {
		return consigneeTelphone2;
	}

	public void setConsigneeTelphone2(String consigneeTelphone2) {
		this.consigneeTelphone2 = consigneeTelphone2;
	}

	public String getConsigneeAddress() {
		return consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
